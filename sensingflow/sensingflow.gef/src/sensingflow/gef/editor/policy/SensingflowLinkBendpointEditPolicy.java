package sensingflow.gef.editor.policy;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

import sensingflow.gef.editor.command.SensingflowLinkCreateBendpointCommand;
import sensingflow.gef.editor.command.SensingflowLinkDeleteBendpointCommand;
import sensingflow.gef.editor.command.SensingflowLinkMoveBendpointCommand;
import sensingflow.model.SensingflowLink;

/**
 * Policy used by the {@link SensingflowLink} to manage link bendpoints.
 */
public class SensingflowLinkBendpointEditPolicy extends BendpointEditPolicy {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Command getCreateBendpointCommand(final BendpointRequest request) {
		SensingflowLinkCreateBendpointCommand command = new SensingflowLinkCreateBendpointCommand();

		Point p = request.getLocation();

		command.setSensingflowLink((SensingflowLink) request.getSource().getModel());
		command.setLocation(p);
		command.setIndex(request.getIndex());

		return command;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Command getMoveBendpointCommand(final BendpointRequest request) {
		SensingflowLinkMoveBendpointCommand command = new SensingflowLinkMoveBendpointCommand();

		Point p = request.getLocation();

		command.setSensingflowLink((SensingflowLink) request.getSource().getModel());
		command.setLocation(p);
		command.setIndex(request.getIndex());

		return command;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Command getDeleteBendpointCommand(final BendpointRequest request) {
		SensingflowLinkDeleteBendpointCommand command = new SensingflowLinkDeleteBendpointCommand();

		command.setSensingflowLink((SensingflowLink) request.getSource().getModel());
		command.setIndex(request.getIndex());
		return command;
	}
}
