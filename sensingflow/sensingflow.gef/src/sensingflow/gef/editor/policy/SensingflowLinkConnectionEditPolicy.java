package sensingflow.gef.editor.policy;

import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import sensingflow.gef.editor.command.SensingflowLinkDeleteCommand;
import sensingflow.model.SensingflowLink;

/**
 * Edit policy used by the SensingflowLink class to server delete requests.
 *
 */
public class SensingflowLinkConnectionEditPolicy extends ConnectionEditPolicy {

	/**
	 * Create a {@link SensingflowLinkDeleteCommand} and fill its details.
	 * 
	 * @param request
	 *            the request that requires treatment.
	 * @return a {@link SensingflowLinkDeleteCommand} that deletes a link from
	 *         the model.
	 */
	@Override
	protected SensingflowLinkDeleteCommand getDeleteCommand(GroupRequest request) {
		SensingflowLinkDeleteCommand command = new SensingflowLinkDeleteCommand();
		command.setLink((SensingflowLink) getHost().getModel());
		return command;
	}
}
