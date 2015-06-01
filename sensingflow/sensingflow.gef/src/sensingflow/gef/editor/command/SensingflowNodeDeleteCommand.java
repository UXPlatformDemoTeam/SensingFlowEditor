package sensingflow.gef.editor.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import sensingflow.model.SensingflowContainer;
import sensingflow.model.SensingflowLink;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowProcessor;
import sensingflow.model.impl.SensingflowSensorImpl;
import sensingflow.model.impl.SensingflowTaskImpl;

/**
 * Command used to delete a node.
 * The functionality of this class fairly closed so it is declared final. 
 */
public final class SensingflowNodeDeleteCommand extends Command {
	
    /** Node to be deleted. */
	private SensingflowNode node;
	/** Container of the node. */
	private SensingflowContainer container;
	/** Incoming and outgoing links. */
	private List<SensingflowLink> links;
	/** Sources for the links that start or end at this node. */
	private Map<SensingflowLink, SensingflowNode> linkSources;
	/** Targets for the links that start or end at this node. */ 
	private Map<SensingflowLink, SensingflowNode> linkTargets;

	@Override
	public void execute() {
		detachLinks();
		node.setContainer(null);
	}

	@Override
	public void undo() {
		reattachLinks();
		node.setContainer(container);
	}

	/**
	 * Detach all links from the node and from the other
	 * connecting node, storing the connection information in local
	 * data structures.
	 */
	private void detachLinks() {
		links = new ArrayList<SensingflowLink>();
		linkSources = new HashMap<SensingflowLink, SensingflowNode>();
		linkTargets = new HashMap<SensingflowLink, SensingflowNode>();
		links.addAll(node.getIncomingLinks());
		links.addAll(node.getOutgoingLinks());
		for (SensingflowLink link : links) {
			linkSources.put(link, link.getSource());
			linkTargets.put(link, link.getTarget());
			link.setSource(null);
			link.setTarget(null);
			link.setProc(null);
		}
	}

	/**
	 * Reattach all links to their source and target node.
	 */
	private void reattachLinks() {
		for (SensingflowLink link : links) {
			link.setSource(linkSources.get(link));
			link.setTarget(linkTargets.get(link));
			if(container instanceof SensingflowProcessor) {
			    link.setProc((SensingflowProcessor) container);
			} else {
			    SensingflowNode containerNode = (SensingflowNode) container;
			    link.setProc(containerNode.getProc());
			}
			
		}
	}
	
	/**
	 * Set the node to delete from the diagram.
	 * @param node the Node to delete from the diagram.
	 */
	public void setNode(final SensingflowNode node) {
		this.node = node;
		this.container = node.getContainer();
	}
}
