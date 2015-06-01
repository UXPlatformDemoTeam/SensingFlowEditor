package sensingflow.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

import sensingflow.gef.editor.command.SensingflowThingRenameCommand;
import sensingflow.gef.editor.figure.SensingflowThingFigure;
import sensingflow.model.SensingflowThing;

public class SensingflowThingDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		SensingflowThingRenameCommand command = new SensingflowThingRenameCommand();
		command.setModel((SensingflowThing) getHost().getModel());
		command.setNewName((String) request.getCellEditor().getValue());
		return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();
		((SensingflowThingFigure) getHostFigure()).getNameLabel().setText(value);
	}
}
