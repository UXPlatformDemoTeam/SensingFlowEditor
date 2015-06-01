package sensingflow.gef.editor.policy;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import sensingflow.gef.editor.command.SensingflowNodeDeleteCommand;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowThing;

/**
 * {@link EditPolicy} used for delete requests.
 */
public class SensingflowNodeComponentEditPolicy extends ComponentEditPolicy {

	/**
	 * Create a command to delete a node. When a node is deleted all incoming
	 * and outgoing links are also deleted (functionality provided by the
	 * command). When a {@link SensingflowThing} node is deleted, there is
	 * special treatment for structural links that start and end at this node.
	 * If this node is source for a structural link, the
	 * {@link SensingflowStructuralLinkAggregator} of this link must be deleted.
	 * Also if this node is the target of the only outgoing link of a
	 * {@link SensingflowStructuralLinkAggregator}, the aggregator must be
	 * deleted.
	 * 
	 * @return a command that deletes a node and all other required diagram
	 *         entities.
	 */
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		SensingflowNode nodeToDelete = (SensingflowNode) getHost().getModel();
		CompoundCommand compoundCommand;
		compoundCommand = createRecursiveDeleteNodeCommand(nodeToDelete);

		return compoundCommand;
	}

	/**
	 * This function creates a command that consists of all the commands
	 * required to delete the given node and all of the nodes contained inside
	 * it. This function is called recursively when a node is a container and
	 * has internal nodes.
	 * 
	 * @param nodeToDelete
	 *            the node that will be deleted.
	 * @return a {@link CompoundCommand} command that deletes the node, the
	 *         contained nodes and all links that must be deleted.
	 */
	private CompoundCommand createRecursiveDeleteNodeCommand(SensingflowNode nodeToDelete) {
		CompoundCommand compoundCommand = new CompoundCommand();

		for (SensingflowNode node : nodeToDelete.getNodes()) {
			Command containedNodeDelete = createRecursiveDeleteNodeCommand(node);
			compoundCommand.add(containedNodeDelete);
		}

		// Create a command to delete the node.
		SensingflowNodeDeleteCommand nodeDeleteCommand = new SensingflowNodeDeleteCommand();
		nodeDeleteCommand.setNode(nodeToDelete);
		compoundCommand.add(nodeDeleteCommand);

		return compoundCommand;
	}
}
