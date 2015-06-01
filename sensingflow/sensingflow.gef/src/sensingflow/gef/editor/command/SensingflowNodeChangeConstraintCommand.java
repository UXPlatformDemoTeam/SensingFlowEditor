package sensingflow.gef.editor.command;

import sensingflow.model.SensingflowNode;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

/**
 * Command used to changed the constraints of a node.
 */
public class SensingflowNodeChangeConstraintCommand extends Command {

	private Rectangle oldConstraint;
	private Rectangle newConstraint;
	private SensingflowNode node;
	
	/**
	 * The command can be executed when all parameters have been set.
	 */
	@Override
	public boolean canExecute() {
	    return node != null && newConstraint != null;
	}
	
	/**
	 * Ther command can be undone if the node and old constraints are set.
	 */
	@Override
	public boolean canUndo() {
	    return node != null && oldConstraint != null;
	}
	
	/**
	 * Save the old constraints and set new new constraints for the {@link SensingflowNode}.
	 */
	@Override public void execute() {
	    oldConstraint = node.getConstraints();
		node.setConstraints(newConstraint);
	}

	/**
	 * Restore the saved constraints to the {@link SensingflowNode}.
	 */
	@Override public void undo() {
		node.setConstraints(oldConstraint);
	}
	
	//TODO changed multiple functions to one parameter function.
	public void setNode(final SensingflowNode node) {
		this.node = node;
	}
	
	public void setNewConstraint(Rectangle newConstraint) {
		this.newConstraint = newConstraint;
	}
}