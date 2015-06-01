package sensingflow.gef.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import sensingflow.model.SensingflowLink;

public class SensingflowLinkCreateBendpointCommand extends Command {
	/** Index on which the new bendpoint is added. */
	private int index;
	/** Location of new bendpoint. */
	private Point location;
	/** Link to which the bendpoint is added. */
	private SensingflowLink link;

	@Override
	public void execute() {
		link.getBendpoints().add(index, location);
	}

	@Override
	public void undo() {
		link.getBendpoints().remove(index);
	}

	/**
	 * Set the index on which the bendpoint is added.
	 * 
	 * @param index
	 *            Index on which the bendpoint should be added.
	 */
	public void setIndex(final int index) {
		this.index = index;
		// TODO:validation checks.
	}

	/**
	 * Set the location where the new bendpoint is added.
	 * 
	 * @param location
	 *            point in the diagram where the new bendpoint is added.
	 */
	public void setLocation(final Point location) {
		this.location = location;
	}

	/**
	 * Set the link on which the new bendpoint is added.
	 * 
	 * @param link
	 *            link on which the bendpoint is added.
	 */
	public void setSensingflowLink(final SensingflowLink link) {
		this.link = link;
	}

}
