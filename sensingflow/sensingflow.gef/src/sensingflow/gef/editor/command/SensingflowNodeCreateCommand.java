package sensingflow.gef.editor.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import sensingflow.model.SensingflowContainer;
import sensingflow.model.SensingflowInPort;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowOutPort;
import sensingflow.model.SensingflowPort;
import sensingflow.model.SensingflowProcessor;
import sensingflow.model.SensingflowThing;
import sensingflow.model.impl.SensingflowInPortImpl;
import sensingflow.model.impl.SensingflowOutPortImpl;
import sensingflow.model.impl.SensingflowPortImpl;
import sensingflow.model.impl.SensingflowSensorImpl;
import sensingflow.model.impl.SensingflowTaskImpl;
import sensingflow.model.SensingflowTask;

/**
 * Command used to create a new {@link SensingflowNode} in the diagram.
 *
 */
public class SensingflowNodeCreateCommand extends Command {

	private SensingflowNode node;
	private Rectangle constraints;
	private SensingflowContainer container;
	private int id = -1;
	private SensingflowThing thing;
	private SensingflowTask task;

	/**
	 * The command can be executed if all parameters have been set.
	 */
	@Override
	public boolean canExecute() {
		return node != null && constraints != null && container != null;
	}

	/**
	 * Set the constraints for the {@link SensingflowNode} and add it to the
	 * container {@link SensingflowProcessor}.
	 */
	@Override
	public void execute() {
		node.setConstraints(constraints);
		node.setContainer(container);
		if (node.getClass().equals(SensingflowOutPortImpl.class)){
			((SensingflowOutPortImpl)node).setThing(thing);
		}
		else if (node.getClass().equals(SensingflowInPortImpl.class)){
			((SensingflowInPortImpl)node).setTask(task);
		}
		int sensor = 0;
		int task = 0;
		for (SensingflowNode node : container.getNodes()) {
			if (node.getClass().equals(SensingflowSensorImpl.class)) {
				sensor++;
			} else if (node.getClass().equals(SensingflowTaskImpl.class)) {
				task++;
			}
		}
		if (node.getClass().equals(SensingflowSensorImpl.class))
		{
			((SensingflowThing)node).setName("Sensor " + sensor);
		}
		else if(node.getClass().equals(SensingflowTaskImpl.class))
		{
			((SensingflowThing)node).setName("Task " + task);
		}
		
	}

	/**
	 * Remove the {@link SensingflowNode} from the container
	 * {@link SensingflowProcessor}.
	 */
	@Override
	public void undo() {
		node.setContainer(null);
	}

	// TODO change multiple functions to one setParameters function.
	public void setConstraints(final Rectangle constraints) {
		this.constraints = constraints;
	}

	public void setContainer(final SensingflowContainer spd) {
		this.container = spd;
	}

	public void setNode(final SensingflowNode node) {
		this.node = node;
	}

	public void setId(final int id) {
		this.id = id;
	}
	
	public void setThing(final SensingflowThing thing) {
		this.thing = thing;
	}
	
	public void setTask(final SensingflowTask task) {
		this.task = task;
	}
}