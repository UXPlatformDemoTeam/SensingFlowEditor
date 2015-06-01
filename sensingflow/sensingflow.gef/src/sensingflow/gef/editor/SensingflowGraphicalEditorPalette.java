package sensingflow.gef.editor;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;

import sensingflow.gef.editor.factory.SensingflowInPortFactory;
import sensingflow.gef.editor.factory.SensingflowLinkFactory;
import sensingflow.gef.editor.factory.SensingflowOutPortFactory;
import sensingflow.gef.editor.factory.SensingflowSensorFactory;
import sensingflow.gef.editor.factory.SensingflowTaskFactory;
import sensingflow.gef.editor.tool.CreationAndDirectEditTool;

public class SensingflowGraphicalEditorPalette extends PaletteRoot {

	PaletteGroup group;

	public SensingflowGraphicalEditorPalette() {
		addGroup();
		addSelectionTool();
		addSensingflowSensorTool();
		addSensingflowTaskTool();
		addSensingflowInPortTool();
		addSensingflowOutPortTool();
		addSensingflowLinkTool();
	}

	private void addSelectionTool() {
		SelectionToolEntry entry = new SelectionToolEntry();
		group.add(entry);
		setDefaultEntry(entry);
	}

	private void addGroup() {
		group = new PaletteGroup("Sensingflow Controls");
		add(group);
	}

	private void addSensingflowSensorTool() {
		CreationToolEntry entry = new CreationToolEntry("Sensor",
				"Create a new Sensor", new SensingflowSensorFactory(), null, null);
		entry.setToolClass(CreationAndDirectEditTool.class);
		group.add(entry);
	}

	private void addSensingflowTaskTool() {
		CreationToolEntry entry = new CreationToolEntry("Task",
				"Create a new Task", new SensingflowTaskFactory(), null, null);
		entry.setToolClass(CreationAndDirectEditTool.class);
		group.add(entry);
	}
	
	private void addSensingflowInPortTool() {
		CreationToolEntry entry = new CreationToolEntry("InPort",
				"Create a new InPort", new SensingflowInPortFactory(), null, null);
		entry.setToolClass(CreationAndDirectEditTool.class);
		group.add(entry);
	}
	
	private void addSensingflowOutPortTool() {
		CreationToolEntry entry = new CreationToolEntry("OutPort",
				"Create a new OutPort", new SensingflowOutPortFactory(), null, null);
		entry.setToolClass(CreationAndDirectEditTool.class);
		group.add(entry);
	}

	private void addSensingflowLinkTool() {
		ConnectionCreationToolEntry entry = new ConnectionCreationToolEntry(
				"Link", "Creates a new link", new SensingflowLinkFactory(), null, null);
		group.add(entry);
	}
}
