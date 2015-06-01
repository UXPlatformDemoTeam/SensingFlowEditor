package sensingflow.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

public class SensingflowPortDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {

		return null;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
	}
}
