package sensingflow.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import sensingflow.gef.editor.command.SensingflowLinkCreateCommand;
import sensingflow.gef.editor.part.SensingflowOutPortEditPart;
import sensingflow.model.SensingflowInPort;
import sensingflow.model.SensingflowLink;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowThing;
import sensingflow.model.impl.SensingflowOutPortImpl;
import sensingflow.model.impl.SensingflowSensorImpl;
import sensingflow.model.impl.SensingflowTaskImpl;

/**
 * Policy used to connect two nodes in the diagram. Currently connections can
 * only be created between two {@link SensingflowThing} instances.
 */
public class SensingflowNodeGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	/**
	 * Create a command used to begin connecting to nodes.
	 * {@link SensingflowStructuralLinkAggregatorEditPart} nodes cannot be
	 * source nodes, therefore in this case a {@link UnexecutableCommand} is
	 * returned.
	 * 
	 * @return a {@link Command} that contains the initial information neede to
	 *         create a connection between two nodes.
	 */
	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		// We must return null and not the usual UnexecutableCommand because is
		// we return a
		// non-null value the framework thinks that the link can be created from
		// this host,
		// something that we don't want to happen.

		if (!(getHost().getClass().equals(
				SensingflowOutPortEditPart.class))) {
			return null;
		}

		SensingflowLinkCreateCommand result = new SensingflowLinkCreateCommand();
		result.setSource((SensingflowNode) getHost().getModel());
		result.setLink((SensingflowLink) request.getNewObject());
		result.setSPD(((SensingflowNode) getHost().getModel()).getProc());
		request.setStartCommand(result);
		return result;
	}

	/**
	 * Retrieves the command created by
	 * {@link SensingflowNodeGraphicalNodeEditPolicy#getConnectionCreateCommand(CreateConnectionRequest)
	 * getConnectionCreateCommand}, and adds it information so that the command
	 * can be executed. {@link SensingflowStructuralLinkAggregatorEditPart}
	 * nodes cannot be source nodes, therefore in this case a
	 * {@link UnexecutableCommand} is returned.
	 * 
	 * @return a {@link Command} that can be executed to create a connection
	 *         between two nodes.
	 */
	@Override
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		// A null command must be returned (and not the usual
		// UnexecutableCommand),
		// otherwise GEF shows the used a symbol that the connection can be
		// completed but
		// when the used clicks it is not created.
		if (request.getStartCommand() == null) {
			return null;
		}
		Command command = null;
		// Simple link creation command.
		if (getHost().getModel().getClass().equals(SensingflowTaskImpl.class)
				|| getHost().getModel().getClass().equals(SensingflowSensorImpl.class) 
				|| getHost().getModel().getClass().equals(SensingflowOutPortImpl.class))
			return null;
		
		// only one input link
		if(((SensingflowInPort)getHost().getModel()).getIncomingLinks().size() == 1)
			return null;
		
		SensingflowLinkCreateCommand linkCreateCommand = (SensingflowLinkCreateCommand) request.getStartCommand();
		linkCreateCommand.setTarget((SensingflowNode) getHost().getModel());
		command = linkCreateCommand;
		return command;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		return null;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		return null;
	}
}