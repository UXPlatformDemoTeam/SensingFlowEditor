package sensingflow.gef.editor.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import sensingflow.gef.editor.figure.SensingflowNodeFigure;
import sensingflow.gef.editor.policy.SensingflowContainerXYLayoutPolicy;
import sensingflow.gef.editor.policy.SensingflowNodeComponentEditPolicy;
import sensingflow.gef.editor.policy.SensingflowNodeGraphicalNodeEditPolicy;
import sensingflow.model.SensingflowLink;
import sensingflow.model.SensingflowNode;

public abstract class SensingflowNodeEditPart extends AbstractGraphicalEditPart implements NodeEditPart {

    protected SensingflowNodeAdapter adapter;

    public SensingflowNodeEditPart() {
        super();
    	adapter = new SensingflowNodeAdapter();
    	
    }
    

    @Override
    protected List<SensingflowLink> getModelSourceConnections() {
    	SensingflowNode model = (SensingflowNode)getModel();
    	return model.getOutgoingLinks();
    }

    @Override
    protected List<SensingflowLink> getModelTargetConnections() {
    	SensingflowNode model = (SensingflowNode)getModel();
    	return model.getIncomingLinks();
    }

    @Override
    public void activate() {
        if(!isActive()) {
            ((SensingflowNode)getModel()).eAdapters().add(adapter);
        }
        super.activate();
    }

    @Override
    public void deactivate() {
        if(isActive()) {
            ((SensingflowNode)getModel()).eAdapters().remove(adapter);
        }
    
        super.deactivate();
    }

    /**
     * Install edit policies that can be applied to {@link SensingflowNodeEditPart} instances.
     */
    @Override
    protected void createEditPolicies() {
        installEditPolicy(EditPolicy.COMPONENT_ROLE, new SensingflowNodeComponentEditPolicy());
        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new SensingflowNodeGraphicalNodeEditPolicy());
        installEditPolicy(EditPolicy.LAYOUT_ROLE, new SensingflowContainerXYLayoutPolicy());
    }
    
    @Override protected List<SensingflowNode> getModelChildren() {
        SensingflowNode model = (SensingflowNode) getModel();
        return Collections.unmodifiableList(model.getNodes());
    }

    @Override
    public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
    	return ((SensingflowNodeFigure)getFigure()).getSourceConnectionAnchor();
    }

    @Override
    public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
    	return ((SensingflowNodeFigure)getFigure()).getTargetConnectionAnchor();
    }

    @Override
    public ConnectionAnchor getSourceConnectionAnchor(Request request) {
    	return ((SensingflowNodeFigure)getFigure()).getSourceConnectionAnchor();
    }

    @Override
    public ConnectionAnchor getTargetConnectionAnchor(Request request) {
    	return ((SensingflowNodeFigure)getFigure()).getTargetConnectionAnchor();
    }

    /**
     * Receives notifications of changes in the model and refreshed the view
     * accordingly.
     *
     */
    public class SensingflowNodeAdapter implements Adapter {
        
        /**
         * For all changes in the model, refresh visuals, source and target.
         */
        @Override public void notifyChanged(Notification notification) {
            refresh();
          
        }
    
        @Override public Notifier getTarget() {
            return (SensingflowNode)getModel();
        }
    
        @Override public void setTarget(Notifier newTarget) {
            // Do nothing.
        }
    
        @Override public boolean isAdapterForType(Object type) {
            return type.equals(SensingflowNode.class);
        }
    }
}