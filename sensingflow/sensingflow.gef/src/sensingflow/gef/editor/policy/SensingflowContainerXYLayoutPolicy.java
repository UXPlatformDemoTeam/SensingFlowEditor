package sensingflow.gef.editor.policy;

import sensingflow.model.SensingflowContainer;
import sensingflow.model.SensingflowInPort;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowOutPort;
import sensingflow.model.SensingflowSensor;
import sensingflow.model.SensingflowTask;
import sensingflow.model.SensingflowThing;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import sensingflow.gef.editor.command.SensingflowNodeCreateCommand;
import sensingflow.gef.editor.command.SensingflowNodeChangeConstraintCommand;
import sensingflow.gef.editor.part.SensingflowInPortEditPart;
import sensingflow.gef.editor.part.SensingflowOutPortEditPart;
import sensingflow.gef.editor.part.SensingflowProcessorEditPart;
import sensingflow.gef.editor.part.SensingflowSensorEditPart;
import sensingflow.gef.editor.part.SensingflowTaskEditPart;

/**
 * This class describes the commands that can be used to change the layout and
 * create new nodes inside the {@link SensingflowContainer}.
 *
 */
public class SensingflowContainerXYLayoutPolicy extends XYLayoutEditPolicy {

	private static final Dimension DEFAULT_THING_DIMENSION = new Dimension(155, 120);
	private static final Dimension DEFAULT_PORT_DIMENSION = new Dimension(40, 13);

	/**
	 * Command created top change the constraints of a {@link SensingflowNode}
	 * instance.
	 */
	@Override
	protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
		SensingflowNodeChangeConstraintCommand command = new SensingflowNodeChangeConstraintCommand();
		command.setNode((SensingflowNode) child.getModel());
		if (child.getClass().equals(SensingflowInPortEditPart.class)
				|| child.getClass().equals(SensingflowOutPortEditPart.class)) {
			((Rectangle) constraint).setSize(DEFAULT_PORT_DIMENSION);
			command.setNewConstraint((Rectangle) constraint);
		} else {
			((Rectangle) constraint).setWidth(DEFAULT_THING_DIMENSION.width);
			command.setNewConstraint((Rectangle) constraint);
		}
		return command;
	}

	/**
	 * Command created to add new nodes to the SPD.
	 */
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		Command retVal = null;
		if (request.getNewObjectType().equals(SensingflowSensor.class)
				|| request.getNewObjectType().equals(SensingflowTask.class)) {
			SensingflowNodeCreateCommand command = new SensingflowNodeCreateCommand();
			if (getHost().getClass().equals(SensingflowProcessorEditPart.class)) {
				Point clickLocation = request.getLocation();
				((GraphicalEditPart) getHost()).getFigure().translateFromParent(clickLocation);
				command.setConstraints(new Rectangle(clickLocation, DEFAULT_THING_DIMENSION));
				command.setContainer((SensingflowContainer) getHost().getModel());
				command.setNode((SensingflowNode) (request.getNewObject()));
				retVal = command;
			}
		}
		if (request.getNewObjectType().equals(SensingflowInPort.class)
				|| request.getNewObjectType().equals(SensingflowOutPort.class)) {
			SensingflowNodeCreateCommand command = new SensingflowNodeCreateCommand();

			if (getHost().getClass().equals(SensingflowTaskEditPart.class)) {
				Point clickLocation = request.getLocation();
				((GraphicalEditPart) getHost()).getFigure().translateFromParent(clickLocation);
				command.setConstraints(new Rectangle(clickLocation, DEFAULT_PORT_DIMENSION));
				command.setContainer((SensingflowContainer) getHost().getModel());
				command.setNode((SensingflowNode) (request.getNewObject()));
				command.setTask((SensingflowTask) getHost().getModel());
				command.setThing((SensingflowThing) getHost().getModel());
				retVal = command;
			}
			if (getHost().getClass().equals(SensingflowSensorEditPart.class)
					&& request.getNewObjectType().equals(SensingflowOutPort.class)) {

				Point clickLocation = request.getLocation();
				((GraphicalEditPart) getHost()).getFigure().translateFromParent(clickLocation);
				command.setConstraints(new Rectangle(clickLocation, DEFAULT_PORT_DIMENSION));
				command.setContainer((SensingflowContainer) getHost().getModel());
				command.setNode((SensingflowNode) (request.getNewObject()));
				command.setThing((SensingflowThing) getHost().getModel());
				retVal = command;
			}
		}
		return retVal;
	}

	/**
	 * The superclass implementation calls
	 * {@link SensingflowContainerXYLayoutPolicy#getResizeChildrenCommand(ChangeBoundsRequest)
	 * getResizeChildrenCommand()} by default. This is not good in our case
	 * since we want to disallow resizing of
	 * {@link SensingflowStructuralLinkAggregatorEditPart} while allowing to
	 * move them. Therefore we had to override the implementation. It creates a
	 * {@link Command} that can be used to move a children of the policy's
	 * owner.
	 * 
	 * @return a {@link Command} used to move children of the host
	 *         {@link EditPart}.
	 */
	@Override
	protected Command getMoveChildrenCommand(Request request) {
		return getChangeConstraintCommand((ChangeBoundsRequest) request);
	}

	/**
	 * Creates a {@link Command} to resize children of the host {@link EditPart}
	 * . The functions checks that the children don't contain any
	 * {@link SensingflowStructuralLinkAggregatorEditPart} instances which
	 * cannot be resized.
	 * 
	 * @return a {@link Commnad} to resize children of the {@link EditPart}.
	 */
	@Override
	protected Command getResizeChildrenCommand(ChangeBoundsRequest request) {
		return getChangeConstraintCommand(request);
	}
}
