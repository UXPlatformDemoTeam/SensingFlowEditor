package sensingflow.gef.editor.command;

import org.eclipse.gef.commands.Command;

import sensingflow.model.SensingflowLink;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowProcessor;

public class SensingflowLinkDeleteCommand extends Command {
	/** Link to be deleted. */
	private SensingflowLink link;
	/** SPD that owns the link. */
	private SensingflowProcessor spd;
	/** Source of the link. */
	private SensingflowNode source;
	/** Target of the link. */
	private SensingflowNode target;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean canExecute() {
		return link != null;
	}

	/**
	 * Disconnect link from source and target things and remove from owner Proc.
	 */
	@Override
	public void execute() {
		spd = link.getProc();
		source = link.getSource();
		target = link.getTarget();

		link.setSource(null);
		link.setTarget(null);
		link.setProc(null);
	}

	/**
	 * Reconnect the link to the source and target and add it to the owner SPD.
	 */
	@Override
	public void undo() {
		link.setSource(source);
		link.setTarget(target);
		link.setProc(spd);
	}

	/**
	 * Set the link that will be delete from the diagram.
	 * 
	 * @param linkParam
	 *            the link to delete from the diagram.
	 */
	public void setLink(final SensingflowLink linkParam) {
		link = linkParam;
	}
}
