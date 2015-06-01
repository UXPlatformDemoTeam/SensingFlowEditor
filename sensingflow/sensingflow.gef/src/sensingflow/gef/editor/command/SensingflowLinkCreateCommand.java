package sensingflow.gef.editor.command;

import org.eclipse.gef.commands.Command;

import sensingflow.model.SensingflowLink;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowProcessor;

public class SensingflowLinkCreateCommand extends Command {
	/** Source {@link SensingflowNode} of the link. */
	private SensingflowNode source;
	/** Target {@link SensingflowNode} of the link. */
	private SensingflowNode target;
	/** {@link SensingflowLink} that is being added by the {@link Command}. */
	private SensingflowLink link;
	/** Container {@link SensingflowProcessor}. */
	private SensingflowProcessor proc;

	/**
	 * The command can be executed when all parameters have been set.
	 */
	@Override
	public boolean canExecute() {
		return source != null && target != null && link != null && proc != null;
	}

	/**
	 * Connect the {@link SensingflowLink} to the given source and target
	 * {@link SensingflowNode} instances and add it to the containing
	 * {@link SensingflowProcessor}.
	 */
	@Override
	public void execute() {
		link.setSource(source);
		link.setTarget(target);
		link.setProc(proc);
	}

	/**
	 * Detach the {@link SensingflowLink} from the source and target {@link SensingflowNode}
	 * instances and from the containing {@link SensingflowProcessor}.
	 */
	@Override
	public void undo() {
		link.getSource().getOutgoingLinks().remove(link);
		link.setSource(null);
		link.getTarget().getIncomingLinks().remove(link);
		link.setTarget(null);
		link.setProc(null);
	}

	// TODO change all parameters to only one parameter function.
	public void setTarget(SensingflowNode target) {
		this.target = target;
	}

	public void setSource(SensingflowNode source) {
		this.source = source;
	}

	public void setLink(SensingflowLink link) {
		this.link = link;
	}

	public void setSPD(SensingflowProcessor proc) {
		this.proc = proc;
	}
}
