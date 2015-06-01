package sensingflow.gef.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.jface.viewers.TextCellEditor;

import sensingflow.gef.editor.SensingflowGraphicalEditor;
import sensingflow.gef.editor.command.SensingflowNodeChangeConstraintCommand;
import sensingflow.gef.editor.command.SensingflowNodeCreateCommand;
import sensingflow.gef.editor.command.SensingflowNodeDeleteCommand;
import sensingflow.gef.editor.factory.SensingflowInPortFactory;
import sensingflow.gef.editor.factory.SensingflowOutPortFactory;
import sensingflow.gef.editor.figure.SensingflowThingFigure;
import sensingflow.gef.editor.policy.SensingflowThingDirectEditPolicy;
import sensingflow.model.SensingflowContainer;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowInPort;
import sensingflow.model.SensingflowOutPort;
import sensingflow.model.SensingflowSensor;
import sensingflow.model.SensingflowSensorType;
import sensingflow.model.SensingflowTask;
import sensingflow.model.SensingflowTaskType;
import sensingflow.model.SensingflowThing;
import sensingflow.model.impl.SensingflowInPortImpl;
import sensingflow.model.impl.SensingflowOutPortImpl;
import sensingflow.model.impl.SensingflowSensorImpl;
import sensingflow.model.impl.SensingflowTaskImpl;

public abstract class SensingflowThingEditPart extends SensingflowNodeEditPart {

	private static final Dimension DEFAULT_PORT_DIMENSION = new Dimension(10, 10);

	public SensingflowThingEditPart() {
		super();
	}

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new SensingflowThingDirectEditPolicy());
		installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
	}

	@Override
	protected void refreshVisuals() {
		SensingflowThingFigure figure = (SensingflowThingFigure) getFigure();
		SensingflowThing model = (SensingflowThing) getModel();
		GraphicalEditPart parent = (GraphicalEditPart) getParent();
		int inport = 0;
		int outport = 0;
		for (SensingflowNode node : getModelChildren()) {
			if (node.getClass().equals(SensingflowInPortImpl.class)) {
				inport++;
			} else if (node.getClass().equals(SensingflowOutPortImpl.class)) {
				outport++;
			}
		}

		if (getModel().getClass().equals(SensingflowSensorImpl.class)) {
			// DKIM: If the operator type has been changed
			boolean typeChanged = (((SensingflowSensor) getModel()).getOldOperatorName() != ((SensingflowSensor) getModel())
					.getOperatorName() && ((SensingflowSensor) getModel()).getOperatorName() != SensingflowSensorType.DEFAULT_SENSOR);
			if (typeChanged) {
				if (outport < 1) {
					SensingflowOutPortFactory newoutport = new SensingflowOutPortFactory();
					SensingflowNodeCreateCommand command = new SensingflowNodeCreateCommand();
					SensingflowOutPort newPort = (SensingflowOutPort) newoutport.getNewObject();
					Point clickLocation = new Point(110, (outport + 1) * 20);
					command.setConstraints(new Rectangle(clickLocation, DEFAULT_PORT_DIMENSION));
					command.setContainer((SensingflowContainer) getModel());
					command.setNode(newPort);
					command.setThing((SensingflowThing) getModel());
					command.execute();
				}
				String DeivceId = SensingflowGraphicalEditor.thingInfo.get(
						((SensingflowSensor) getModel()).getOperatorName().toString()).getDeviceId();
				String LogicParam = SensingflowGraphicalEditor.thingInfo.get(
						((SensingflowSensor) getModel()).getOperatorName().toString()).getlogic();
				((SensingflowSensor) getModel()).setOldOperatorName(((SensingflowSensor) getModel()).getOperatorName());

				((SensingflowSensor) getModel()).setDeviceId(DeivceId);
				((SensingflowSensor) getModel()).setLogicParameter(LogicParam);
				((SensingflowSensor) getModel()).setName(((SensingflowSensor) getModel()).getOperatorName().toString());

				switch (((SensingflowSensor) getModel()).getOperatorName()) {
				case SENSING_SOUND:
					for (SensingflowNode node : getModelChildren()) {
						if (node.getClass().equals(SensingflowOutPortImpl.class)) {
							((SensingflowOutPort) node).setFrameSize(30720);
							((SensingflowOutPort) node).setSubFrameSize(512);
							((SensingflowOutPort) node).setSubFrameSlidingSize(512);
							((SensingflowOutPort) node).setFrameInterval(30720);
						}
					}
					break;
				case ACCEL_DEFAULT:
					for (SensingflowNode node : getModelChildren()) {
						if (node.getClass().equals(SensingflowOutPortImpl.class)) {
							((SensingflowOutPort) node).setFrameSize(6000);
							((SensingflowOutPort) node).setSubFrameSize(180);
							((SensingflowOutPort) node).setSubFrameSlidingSize(180);
							((SensingflowOutPort) node).setFrameInterval(6000);
						}
					}
					break;
				case DEFAULT_SENSOR:
					break;
				default:
					break;
				}
			}

		} else if (getModel().getClass().equals(SensingflowTaskImpl.class)) {
			if (((SensingflowTask) getModel()).getOperatorName() != SensingflowTaskType.DEFAULT_TASK) {
				String numInput = SensingflowGraphicalEditor.thingInfo.get(
						((SensingflowTask) getModel()).getOperatorName().toString()).getNumInput();
				String numOutput = SensingflowGraphicalEditor.thingInfo.get(
						((SensingflowTask) getModel()).getOperatorName().toString()).getNumOutput();
				int numports = getModelChildren().size();

				// DKIM: Remove unnecessary ports
				if (inport > Integer.parseInt(numInput)) {
					for (int i = 0; i < numports; i++) {
						SensingflowNode node = getModelChildren().get(i);
						if (node.getClass().equals(SensingflowInPortImpl.class)) {
							((SensingflowTask) getModel()).getInPorts().remove(node);
							SensingflowNodeDeleteCommand command = new SensingflowNodeDeleteCommand();
							command.setNode(node);
							command.execute();
							break;
						}
					}
				}
				if (outport > Integer.parseInt(numOutput)) {
					for (int i = 0; i < numports; i++) {
						SensingflowNode node = getModelChildren().get(i);
						if (node.getClass().equals(SensingflowOutPortImpl.class)) {
							((SensingflowTask) getModel()).getOutPorts().remove(node);
							SensingflowNodeDeleteCommand command = new SensingflowNodeDeleteCommand();
							command.setNode(node);
							command.execute();
							break;
						}
					}
				}
				if (inport < Integer.parseInt(numInput)) {
					SensingflowInPortFactory newinport = new SensingflowInPortFactory();
					SensingflowNodeCreateCommand command = new SensingflowNodeCreateCommand();
					Point clickLocation = new Point(10, (inport + 1) * 20);
					command.setConstraints(new Rectangle(clickLocation, DEFAULT_PORT_DIMENSION));
					command.setContainer((SensingflowContainer) getModel());
					command.setNode((SensingflowNode) (newinport.getNewObject()));
					command.setTask((SensingflowTask) getModel());
					command.execute();
				}
				if (outport < Integer.parseInt(numOutput)) {
					SensingflowOutPortFactory newoutport = new SensingflowOutPortFactory();
					SensingflowNodeCreateCommand command = new SensingflowNodeCreateCommand();
					SensingflowOutPort newPort = (SensingflowOutPort) newoutport.getNewObject();
					Point clickLocation = new Point(130, (outport + 1) * 20);
					command.setConstraints(new Rectangle(clickLocation, DEFAULT_PORT_DIMENSION));
					command.setContainer((SensingflowContainer) getModel());
					command.setNode(newPort);
					command.setThing((SensingflowThing) getModel());
					command.execute();
				}
			}
			boolean typeChanged = (((SensingflowTask) getModel()).getOldOperatorName() != ((SensingflowTask) getModel())
					.getOperatorName() && ((SensingflowTask) getModel()).getOperatorName() != SensingflowTaskType.DEFAULT_TASK);

			if (typeChanged) {
				String numOutput = SensingflowGraphicalEditor.thingInfo.get(
						((SensingflowTask) getModel()).getOperatorName().toString()).getNumOutput();

				String DeivceId = SensingflowGraphicalEditor.thingInfo.get(
						((SensingflowTask) getModel()).getOperatorName().toString()).getDeviceId();
				String LogicParam = SensingflowGraphicalEditor.thingInfo.get(
						((SensingflowTask) getModel()).getOperatorName().toString()).getlogic();
				((SensingflowTask) getModel()).setOldOperatorName(((SensingflowTask) getModel()).getOperatorName());
				((SensingflowTask) getModel()).setDeviceId(DeivceId);
				((SensingflowTask) getModel()).setLogicParameter(LogicParam);
				((SensingflowTask) getModel()).setName(((SensingflowTask) getModel()).getOperatorName().toString());
			}
		}
		if (getModel().getClass().equals(SensingflowSensorImpl.class)
				|| getModel().getClass().equals(SensingflowTaskImpl.class)) {
			SensingflowNodeChangeConstraintCommand command = new SensingflowNodeChangeConstraintCommand();
			inport = 0;
			outport = 0;
			for (SensingflowNode node : getModelChildren()) {
				command.setNode(node);
				if (node.getClass().equals(SensingflowInPortImpl.class)) {
					Point clickLocation = new Point(10, (inport + 1) * 20);
					command.setNewConstraint(new Rectangle(clickLocation, DEFAULT_PORT_DIMENSION));
					command.execute();
					inport++;
				} else if (node.getClass().equals(SensingflowOutPortImpl.class)) {
					Point clickLocation = new Point(130, (outport + 1) * 20);
					command.setNewConstraint(new Rectangle(clickLocation, DEFAULT_PORT_DIMENSION));
					command.execute();

					outport++;
				}
			}
			int max = (inport > outport) ? inport : outport;
			Rectangle r = ((SensingflowNode) getModel()).getConstraints();
			if (r.height <= (max + 1) * 20 || r.height > (max + 1) * 20 + 20) {
				command.setNode((SensingflowNode) getModel());
				command.setNewConstraint(new Rectangle(r.getLocation(), new Dimension(r.width, (max + 1) * 20 + 20)));
				command.execute();
			}
		}
		figure.getNameLabel().setText(model.getName());
		parent.setLayoutConstraint(this, figure, model.getConstraints());
	}

	@Override
	public void performRequest(Request req) {
		if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			performDirectEditing();
		}
	}

	private void performDirectEditing() {
		Label label = ((SensingflowThingFigure) getFigure()).getNameLabel();
		SensingflowThingDirectEditManager manager = new SensingflowThingDirectEditManager(this, TextCellEditor.class,
				new SensingflowThingCellEditorLocator(label), label);
		manager.show();
	}

	@Override
	public IFigure getContentPane() {
		return ((SensingflowThingFigure) getFigure()).getContentPane();
	}

	/**
	 * Currently the class only adapts to create a {@link SnapToHelper} when the
	 * editor is in snapping mode (either to grid or to shapes).
	 */
	@Override
	public Object getAdapter(Class key) {
		if (key == SnapToHelper.class) {
			List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
			if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED))) {
				helpers.add(new SnapToGeometry(this));
			}
			if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED))) {
				helpers.add(new SnapToGrid(this));
			}
			if (helpers.size() == 0) {
				return null;
			} else {
				return new CompoundSnapToHelper(helpers.toArray(new SnapToHelper[0]));
			}
		}
		return super.getAdapter(key);
	}

}
