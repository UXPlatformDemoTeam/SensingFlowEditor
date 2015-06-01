package sensingflow.gef.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import sensingflow.model.SensingflowLink;

/**
 * Move a link bendpoint.
 * This class is declared final since it has a very specific functionality.
 */
public final class SensingflowLinkMoveBendpointCommand extends Command {
	
	/** Old location of the moved bendpoint. */
	private Point oldLocation;
	/** New location of the moved bendpoint. */
	private Point newLocation;
	/** Index of the bendpoint in the link's bendpoint list. */
	private int index;
	/** Link that contains the bendpoint. */
	private SensingflowLink link;
	
	/** Move the bendpoint to the new location. */
	public void execute() {
		if(oldLocation == null) {
			oldLocation = link.getBendpoints().get(index);
		}
		link.getBendpoints().set(index, newLocation);
	}
	
	/** Restore the old location of the bendpoint. */
	@Override public void undo() {
		link.getBendpoints().set(index, oldLocation);
	}

	/** 
	 * Set the index where the bendpoint is located in the bendpoint list.
	 * @param index the index where the bendpoint is located. 
	 */
	public void setIndex(final int index) {
		this.index = index;
	}
	
	/**
	 * Set the link where the bendpoint is located. 
	 * @param link the link where the bendpoint is located. 
	 */
	public void setSensingflowLink(final SensingflowLink link) {
		this.link = link;
	}
	
	/**
	 * Set the new location of the bendpoint. 
	 * @param newLocation the new location of the bendpoint. 
	 */
	public void setLocation(final Point newLocation) {
		this.newLocation = newLocation;
	}
}
