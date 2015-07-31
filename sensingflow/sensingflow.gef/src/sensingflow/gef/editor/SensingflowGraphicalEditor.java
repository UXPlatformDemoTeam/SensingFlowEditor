package sensingflow.gef.editor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ToggleGridAction;
import org.eclipse.gef.ui.actions.ToggleSnapToGeometryAction;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gef.ui.properties.UndoablePropertySheetPage;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import sensingflow.gef.editor.part.SensingflowEditPartFactory;
import sensingflow.model.SensingflowPackage;
import sensingflow.model.SensingflowProcessor;
import sensingflow.model.provider.SensingflowItemProviderAdapterFactory;

public class SensingflowGraphicalEditor extends GraphicalEditorWithFlyoutPalette {

	public static HashMap<String, SensingflowThingInfo> thingInfo;
	private Resource spdResource;
	private SensingflowProcessor spd;
	PropertySheetPage propertyPage;

	/**
	 * Initialize the {@link EditDomain} of the editor.
	 */
	public SensingflowGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}

	@Override
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
		getGraphicalViewer().setContents(spd);
	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		
		getGraphicalViewer().setEditPartFactory(new SensingflowEditPartFactory());
		getActionRegistry().registerAction(new ToggleGridAction(getGraphicalViewer()));
		getActionRegistry().registerAction(new ToggleSnapToGeometryAction(getGraphicalViewer()));
	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		return new SensingflowGraphicalEditorPalette();
	}

	/**
	 * Save the model using the resource from which it was opened, and mark the
	 * current location in the {@link CommandStack}.
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		if (spdResource == null) {
			return;
		}
		try {
			spdResource.save(null);

			/* DKIM: export to custom XML file */
			System.out.println("Save to: " + spdResource.getURI());
			HashMap<Integer, ArrayList<Integer>> node_to_inport = new HashMap<Integer, ArrayList<Integer>>();
			HashMap<Integer, ArrayList<Integer>> node_to_outport = new HashMap<Integer, ArrayList<Integer>>();
			getCommandStack().markSaveLocation();

			SAXBuilder saxBuilder = new SAXBuilder();

			// the new doc that you will write too
			Document exportDoc = new Document();
			// where modelPath a string originated from the IPath of the model
			// file
			String originalPath = spdResource.getURI().toString().replace("file:", "");
			String exportPath = originalPath.substring(0, originalPath.lastIndexOf(".") + 1) + "xml";
			Document originalDoc = saxBuilder.build(new File(originalPath));
			Element rootElement = originalDoc.getRootElement();
			System.out.println(originalPath);
			// create new root element
			Element newRootElement = new Element("Processor");
			exportDoc.setRootElement(newRootElement);
			int[][] nodeIf = new int[100][100];
			// Add Task / Sensor

			for (Element elm : rootElement.getChildren()) {
				String type = elm.getAttributeValue("operatorName");
				if (type != null) {
					int Port = 0;
					int nodeID;
					String tmp = elm.getAttributeValue("outPorts");
					if (tmp != null) {
						nodeID = Integer.parseInt(tmp.split("//")[1].split("/")[0].replace("@nodes.", ""));
					} else {
						tmp = elm.getAttributeValue("inPorts");
						nodeID = Integer.parseInt(tmp.split("//")[1].split("/")[0].replace("@nodes.", ""));
					}
					for (Element elm2 : elm.getChildren()) {
						Namespace XSI = Namespace.getNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
						String tmp2 = elm2.getAttributeValue("type", XSI);
						if (tmp2 != null) {
							if (node_to_outport.containsKey(nodeID) == false) {
								node_to_outport.put(nodeID, new ArrayList<Integer>());
							}
							if (node_to_inport.containsKey(nodeID) == false) {
								node_to_inport.put(nodeID, new ArrayList<Integer>());
							}
							if (tmp2.equals("sensingflow:SensingflowOutPort")) {
								node_to_outport.get(nodeID).add(Port);
								Port++;
							} else {
								node_to_inport.get(nodeID).add(Port);
								Port++;
							}
						}
					}
					// nodeID++;
				}
			}
			for (Element elm : rootElement.getChildren()) {
				String type = elm.getAttributeValue("operatorName");
				if (type != null) {
					Element child = new Element("Task");

					String tmp = elm.getAttributeValue("outPorts");
					String ID;
					if (tmp != null) {
						ID = tmp.split("//")[1].split("/")[0].replace("@nodes.", "");
					} else {
						tmp = elm.getAttributeValue("inPorts");
						ID = tmp.split("//")[1].split("/")[0].replace("@nodes.", "");
					}
					tmp = elm.getAttributeValue("logicParameter");
					String logicParam = "";
					if (tmp != null) {
						logicParam = tmp;
					}
					tmp = elm.getAttributeValue("InstantParameter");
					String instantParam = "";
					if (tmp != null) {
						instantParam = tmp;
					}
					tmp = elm.getAttributeValue("DeviceId");
					String deviceId = "";
					if (tmp != null) {
						deviceId = tmp;
					}
					tmp = elm.getAttributeValue("constraints");
					String constraint = "";
					if (tmp != null) {
						constraint = tmp;
					}
					Attribute attr = new Attribute("ID", ID);
					child.setAttribute(attr);
					attr = new Attribute("TaskType", type);
					child.setAttribute(attr);
					attr = new Attribute("LogicParameter", logicParam);
					child.setAttribute(attr);
					attr = new Attribute("InstantParameter", instantParam);
					child.setAttribute(attr);
					attr = new Attribute("DeviceId", deviceId);
					child.setAttribute(attr);
					attr = new Attribute("constraints", constraint);
					child.setAttribute(attr);
					attr = new Attribute("numIn", Integer.toString(node_to_inport.get(Integer.parseInt(ID)).size()));
					child.setAttribute(attr);
					attr = new Attribute("numOut", Integer.toString(node_to_outport.get(Integer.parseInt(ID)).size()));
					child.setAttribute(attr);
					newRootElement.addContent(child);
				}
				if (elm.getName() == "links") {
					Element child = new Element("Connection");
					String tmp = elm.getAttributeValue("source");
					int SID = Integer.parseInt(tmp.split("//")[1].split("/")[0].replace("@nodes.", ""));
					int SIF = Integer.parseInt(tmp.split("//")[1].split("/")[1].replace("@nodes.", ""));
					tmp = elm.getAttributeValue("target");
					String TID = tmp.split("//")[1].split("/")[0].replace("@nodes.", "");
					String TIF = tmp.split("//")[1].split("/")[1].replace("@nodes.", "");

					Attribute attr = new Attribute("From", Integer.toString(SID));
					child.setAttribute(attr);
					String FromIf = Integer.toString(node_to_outport.get(SID).indexOf(SIF))
							+ Integer.toString(nodeIf[SID][SIF]++);
					if (FromIf.length() != 3)
						FromIf = "0" + FromIf;
					attr = new Attribute("FromIf", FromIf);
					child.setAttribute(attr);
					attr = new Attribute("To", TID);
					child.setAttribute(attr);
					attr = new Attribute("ToIf", Integer.toString(node_to_inport.get(Integer.parseInt(TID)).indexOf(
							Integer.parseInt(TIF))));
					child.setAttribute(attr);
					newRootElement.addContent(child);
				}
			}

			// an outputter than will use a pretty print format
			XMLOutputter xmlOutput = new XMLOutputter();
			xmlOutput.setFormat(Format.getPrettyFormat());
			File exportFile = new File(exportPath);
			if (!exportFile.exists()) {
				exportFile.createNewFile();
			}
			xmlOutput.output(exportDoc, new FileWriter(exportPath));
			// System.out.println(xmlOutput.outputString(exportDoc));

		} catch (IOException e) {
			// TODO do something smarter.
			e.printStackTrace();
			spdResource = null;
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);

		loadInput(input);
	}

	private void loadInput(IEditorInput input) {
		SensingflowPackage.eINSTANCE.eClass(); // This initializes the
												// SensingflowPackage
		// singleton implementation.
		ResourceSet resourceSet = new ResourceSetImpl();
		if (input instanceof IFileEditorInput) {
			IFileEditorInput fileInput = (IFileEditorInput) input;
			IFile file = fileInput.getFile();
			String importPath = file.getLocationURI().toString();
			System.out.println(importPath);
			try {
				String filePath = file.getLocation().toString();
				// DKIM: Load operator_info.xml
				String currentPath = new File(SensingflowGraphicalEditor.class.getProtectionDomain().getCodeSource()
						.getLocation().getPath()).getAbsolutePath();
				String infoPath = currentPath.substring(0, currentPath.lastIndexOf("/") + 1) + "operator_info.xml";
				thingInfo = new HashMap<String, SensingflowThingInfo>();
				SAXBuilder saxBuilder = new SAXBuilder();
				Document operator_info = saxBuilder.build(new File(infoPath));
				Element rootElement = operator_info.getRootElement();
				for (Element elm : rootElement.getChildren()) {
					// DKIM: Add Task/sensors
					for (Element tlist : elm.getChildren()) {
						SensingflowThingInfo tmp = new SensingflowThingInfo();
						tmp.setName(tlist.getAttributeValue("operatorName"));
						tmp.setDeviceId(tlist.getAttributeValue("deviceId"));
						tmp.setLogic(tlist.getAttributeValue("logic"));
						if (tlist.getName() == "Task") {
							tmp.setNumInput(tlist.getChild("Inputs").getAttributeValue("interfaces"));
							tmp.setNumOutput(tlist.getChild("Outputs").getAttributeValue("interfaces"));
							tmp.setType("Task");
						} else {
							tmp.setNumInput("0");
							tmp.setNumOutput("1");
							tmp.setType("Sensor");
						}
						thingInfo.put(tmp.getName(), tmp);
					}
				}
				Document LoadFile = saxBuilder.build(new File(filePath));
				rootElement = LoadFile.getRootElement();
				// DKIM: convert XML to the original format
				if (rootElement.getName() == "Processor") {
					ArrayList<SensingflowConnInfo> conn = new ArrayList<SensingflowConnInfo>();

					Attribute attr;

					int numSensor = 0;
					int numTask = 0;
					// the new doc that you will write too
					Document exportDoc = new Document();
					Namespace namespace = Namespace.getNamespace("sensingflow", "sensingflow.kaist");
					Element newRootElement = new Element("SensingflowProcessor");
					newRootElement.setNamespace(namespace);
					Namespace XSI = Namespace.getNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
					newRootElement.addNamespaceDeclaration(XSI);
					newRootElement.addNamespaceDeclaration(namespace);
					Namespace XMI = Namespace.getNamespace("xmi", "http://www.omg.org/XMI");
					newRootElement.addNamespaceDeclaration(XMI);

					int[] numOutputID = new int[100];
					int[] numOutputSize = new int[100];
					// DKIM: Check connections
					for (Element elm : rootElement.getChildren()) {
						if (elm.getName() == "Connection") {
							SensingflowConnInfo tmp = new SensingflowConnInfo();
							tmp.setFromID(elm.getAttributeValue("From"));
							if (elm.getAttributeValue("FromIf") == null) {
								tmp.setFromIf("000");
							} else {
								String FromIf = elm.getAttributeValue("FromIf");
								if (FromIf.length() == 2)
									FromIf = "0" + FromIf;
								else if (FromIf.length() == 1)
									FromIf = "00" + FromIf;
								tmp.setFromIf(FromIf);
							}
							tmp.setToID(elm.getAttributeValue("To"));
							tmp.setToIf(elm.getAttributeValue("ToIf"));
							conn.add(tmp);
						}
					}
					HashMap<String, Integer> NodeID = new HashMap<String, Integer>();

					int numNode = 0;
					for (Element elm : rootElement.getChildren()) {
						if (elm.getName() == "Task") {
							String name = elm.getAttributeValue("TaskType");
							String ID = elm.getAttributeValue("ID");
							NodeID.put(ID, numNode);
							SensingflowThingInfo tmp = thingInfo.get(name);
							Element child = new Element("nodes");
							if (tmp.getType() == "Sensor") {
								attr = new Attribute("type", "sensingflow:SensingflowSensor");
								numSensor++;
							} else {
								attr = new Attribute("type", "sensingflow:SensingflowTask");
								numTask++;
							}
							attr.setNamespace(XSI);
							child.setAttribute(attr);

							String strtmp = elm.getAttributeValue("numIn");
							int numInput = (strtmp!=null)?Integer.parseInt(strtmp):Integer.parseInt(tmp.getNumInput());
							strtmp = elm.getAttributeValue("numOut");
							int numOutput = (strtmp!=null)?Integer.parseInt(strtmp):Integer.parseInt(tmp.getNumOutput());
						
							numOutputID[Integer.parseInt(ID)] = numOutput;
							String outports = "";
							for (int i = 0; i < numOutput; i++) {
								if (i != 0)
									outports += " ";
								outports += "//@nodes." + NodeID.get(ID) + "/@nodes." + i;
								Element port = new Element("nodes");
								attr = new Attribute("type", "sensingflow:SensingflowOutPort");
								attr.setNamespace(XSI);
								port.setAttribute(attr);

								int cnt = 0;
								String outgoing = "";

								for (SensingflowConnInfo tmpconn : conn) {
									if (Integer.parseInt(tmpconn.getFromID()) == Integer.parseInt(ID)) {
										if (tmpconn.getFromIf() != null) {
											int If = Integer.parseInt(tmpconn.getFromIf().substring(0, 2));
											if (If != i)
												continue;
										}
										int idx = conn.indexOf(tmpconn);
										if (cnt++ != 0)
											outgoing += " ";
										outgoing += "//@links." + Integer.toString(idx);
									}
								}
								attr = new Attribute("outgoingLinks", outgoing);
								port.setAttribute(attr);
								attr = new Attribute("constraints", "130," + 20 * (i + 1) + ",10,10");
								port.setAttribute(attr);
								attr = new Attribute("thing", "//@nodes." + ID);
								port.setAttribute(attr);
								child.addContent(port);
							}
							child.setAttribute("outPorts", outports);
							String inports = "";
							for (int i = numOutput; i < numOutput + numInput; i++) {
								if (i != numOutput)
									inports += " ";
								inports += "//@nodes." + NodeID.get(ID) + "/@nodes." + i;
								Element port = new Element("nodes");
								attr = new Attribute("type", "sensingflow:SensingflowInPort");
								attr.setNamespace(XSI);
								port.setAttribute(attr);
								int cnt = 0;
								String incoming = "";
								for (SensingflowConnInfo tmpconn : conn) {
									if (Integer.parseInt(tmpconn.getToID()) == Integer.parseInt(ID)) {
										if (tmpconn.getToIf() != null
												&& Integer.parseInt(tmpconn.getToIf()) != i - numOutput)
											continue;
										int idx = conn.indexOf(tmpconn);
										if (cnt++ != 0)
											incoming += " ";
										incoming += "//@links." + Integer.toString(idx);
									}
								}
								attr = new Attribute("incomingLinks", incoming);
								port.setAttribute(attr);
								attr = new Attribute("constraints", "10," + 20 * (i - numOutput + 1) + ",10,10");
								port.setAttribute(attr);
								attr = new Attribute("task", "//@nodes." + ID);
								port.setAttribute(attr);
								child.addContent(port);
							}
							if (tmp.getType().equals("Task")) {
								child.setAttribute("inPorts", inports);
							}
							String constraint = elm.getAttributeValue("constraints");
							if (constraint == null) {
								if (tmp.getType().equals("Sensor")) {
									constraint = "100," + Integer.toString(100 + 200 * numSensor) + ",155,60";
								}
								if (tmp.getType().equals("Task")) {
									constraint = "400," + Integer.toString(100 + 200 * numTask) + ",155,60";
								}
							}
							child.setAttribute("constraints", constraint);
							String val = elm.getAttributeValue("LogicParameter");
							child.setAttribute("logicParameter", val);
							val = elm.getAttributeValue("DeviceId");
							child.setAttribute("DeviceId", val);
							child.setAttribute("name", name);
							child.setAttribute("operatorName", name);
							newRootElement.addContent(child);
							numNode++;
						}
					}
					for (SensingflowConnInfo tmpconn : conn) {
						Element links = new Element("links");
						String From = tmpconn.getFromID();
						String FromIf = tmpconn.getFromIf();
						String To = tmpconn.getToID();
						String ToIf = tmpconn.getToIf();
						int PortID = numOutputID[Integer.parseInt(From)];
						if (ToIf != null)
							PortID += Integer.parseInt(ToIf);
						String If = Integer.toString(Integer.parseInt(FromIf.substring(0, 2)));
						attr = new Attribute("source", "//@nodes." + NodeID.get(From) + "/@nodes." + If);
						links.setAttribute(attr);
						attr = new Attribute("target", "//@nodes." + NodeID.get(To) + "/@nodes." + PortID);
						links.setAttribute(attr);
						newRootElement.addContent(links);
					}
					exportDoc.setRootElement(newRootElement);
					importPath = filePath.substring(0, filePath.lastIndexOf(".") + 1) + "sensingflow";
					File importFile = new File(importPath);
					if (!importFile.exists()) {
						importFile.createNewFile();
					}
					// an outputter than will use a pretty print format
					XMLOutputter xmlOutput = new XMLOutputter();
					xmlOutput.setFormat(Format.getPrettyFormat());
					xmlOutput.output(exportDoc, new FileWriter(importPath));
					importPath = "file:" + importPath;
				}

			} catch (JDOMException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			spdResource = resourceSet.createResource(URI.createURI(importPath));
			try {
				spdResource.load(null);
				spd = (SensingflowProcessor) spdResource.getContents().get(0);
			} catch (IOException e) {
				// TODO do something smarter.
				e.printStackTrace();
				spdResource = null;
			}
		}
	}

	/**
	 * Fire a {@link IEditorPart#PROP_DIRTY} property change and call super
	 * implementation.
	 */
	@Override
	public void commandStackChanged(EventObject event) {
		firePropertyChange(PROP_DIRTY);
		super.commandStackChanged(event);
	}

	/**
	 * This method implements adapting to {@link IPropertySheetPage}. All other
	 * requests are forwarded to the
	 * {@link GraphicalEditorWithFlyoutPalette#getAdapter(Class) parent}
	 * implementation.
	 */
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class type) {
		if (type.equals(IPropertySheetPage.class)) {
			if (propertyPage == null) {
				propertyPage = (UndoablePropertySheetPage) super.getAdapter(type);
				// A new PropertySourceProvider was implemented to fetch the
				// model
				// from the edit part when required. The property source is
				// provided
				// by the generated EMF classes and wrapped by the
				// AdapterFactoryContentProvider
				// to yield standard eclipse interfaces.
				IPropertySourceProvider sourceProvider = new IPropertySourceProvider() {
					IPropertySourceProvider modelPropertySourceProvider = new AdapterFactoryContentProvider(
							new SensingflowItemProviderAdapterFactory());

					@Override
					public IPropertySource getPropertySource(Object object) {
						IPropertySource source = null;
						if (object instanceof EditPart) {
							source = modelPropertySourceProvider.getPropertySource(((EditPart) object).getModel());
						} else {
							source = modelPropertySourceProvider.getPropertySource(object);
						}

						if (source != null) {
							return new UnwrappingPropertySource(source);
						} else {
							return null;
						}
					}

				};
				UndoablePropertySheetEntry root = new UndoablePropertySheetEntry(getCommandStack());
				root.setPropertySourceProvider(sourceProvider);
				propertyPage.setRootEntry(root);
			}
			return propertyPage;
		}
		return super.getAdapter(type);
	}

	/**
	 * A property source which unwraps values that are wrapped in an EMF
	 * {@link PropertyValueWrapper}
	 * 
	 */
	public class UnwrappingPropertySource implements IPropertySource {
		private IPropertySource source;

		public UnwrappingPropertySource(final IPropertySource source) {
			this.source = source;
		}

		@Override
		public Object getEditableValue() {
			Object value = source.getEditableValue();
			if (value instanceof PropertyValueWrapper) {
				PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
				return wrapper.getEditableValue(null);
			} else {
				return source.getEditableValue();
			}
		}

		@Override
		public IPropertyDescriptor[] getPropertyDescriptors() {
			return source.getPropertyDescriptors();
		}

		@Override
		public Object getPropertyValue(Object id) {
			Object value = source.getPropertyValue(id);
			if (value instanceof PropertyValueWrapper) {
				PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
				return wrapper.getEditableValue(null);
			} else {
				return source.getPropertyValue(id);
			}
		}

		@Override
		public boolean isPropertySet(Object id) {
			return source.isPropertySet(id);
		}

		@Override
		public void resetPropertyValue(Object id) {
			source.resetPropertyValue(id);
		}

		@Override
		public void setPropertyValue(Object id, Object value) {
			source.setPropertyValue(id, value);
		}
	}
}
