package sensingflow.gef.editor.command;

import org.eclipse.gef.commands.Command;

import sensingflow.model.SensingflowThing;

public class SensingflowThingRenameCommand extends Command {
	
	private String oldName, newName;
	private SensingflowThing model;

	@Override public void execute() {
		oldName = model.getName();
		model.setName(newName);
	}

	@Override public void undo() {
		model.setName(oldName);
	}
	
	public void setNewName(String newName) {
		this.newName = newName;
	}
	
	public void setModel(SensingflowThing model) {
		this.model = model;
	}
}