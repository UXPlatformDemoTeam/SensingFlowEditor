package sensingflow.gef.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ManhattanConnectionRouter;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.ImageData;

import sensingflow.gef.editor.policy.SensingflowLinkBendpointEditPolicy;
import sensingflow.gef.editor.policy.SensingflowLinkConnectionEditPolicy;
import sensingflow.model.SensingflowLink;
import sensingflow.model.SensingflowLinkRouterKind;

/**
 * {@link EditPart} for the {@link SensingflowLink} model element.
 */
public class SensingflowLinkEditPart extends AbstractConnectionEditPart {

	private SensingflowLinkAdapter adapter;
	
	/**
	 * Create and initialize a new {@link SensingflowLinkEditPart}.
	 */
	public SensingflowLinkEditPart() {
		super();
		adapter = new SensingflowLinkAdapter();
	}
	
	/**
	 * Installs two edit policies:
	 * <ol>
	 *   <li>For the {@link EditPolicy#CONNECTION_ENDPOINTS_ROLE} a {@link ConnectionEndpoinEditPolicy}.</li>
	 *   <li>For the {@link EditPolicy#CONNECTION_ROLE} a {@link SensingflowLinkConnectionEditPolicy}.</li>
	 *   <li>For the {@link EditPolicy#CONNECTION_BENDPOINTS_ROLE} a {@link SensingflowLinkBendpointEditPolicy} (for
	 *   links that use a {@link BendpointConnectionRouter}).</li>
	 * </ol>
	 */
	@Override protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new SensingflowLinkConnectionEditPolicy());
		if(((SensingflowLink)getModel()).getRouterKind() == SensingflowLinkRouterKind.BENDPOINT) {
		    installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new SensingflowLinkBendpointEditPolicy());
		}
	}

	/**
	 * Create a {@link PolylineConnection} with a {@link BendpointConnectionRouter}
	 */
	@Override protected PolylineConnection createFigure() {
		
		PolylineConnection conn = new PolylineConnection();
		conn.setLineWidth(2);
		switch(((SensingflowLink)getModel()).getRouterKind()) {
		case BENDPOINT:
		    conn.setConnectionRouter(new BendpointConnectionRouter());
		    break;
		case MANHATTAN:
		    conn.setConnectionRouter(new ManhattanConnectionRouter());
		    break;
		}
		return conn; 

	}
	
	@Override protected void refreshVisuals() {
	    switch(((SensingflowLink)getModel()).getRouterKind()) {
	    case BENDPOINT:
	        Connection connection = getConnectionFigure();
    		List<Point> modelConstraint = ((SensingflowLink)getModel()).getBendpoints();
    		List<AbsoluteBendpoint> figureConstraint = new ArrayList<AbsoluteBendpoint>();
    		for (Point p : modelConstraint) {
    			figureConstraint.add(new AbsoluteBendpoint(p));
    		}
    		connection.setRoutingConstraint(figureConstraint);
    		break;
	    case MANHATTAN:
	        break;
	    }
	}
	
	@Override public void activate() {
		if(!isActive()) {
			((SensingflowLink)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override public void deactivate() {
		if(isActive()) {
			((SensingflowLink)getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}	
	
	/**
	 * Observer for changes in an SensingflowLink. Refreshes the
	 * {@link EditPart} visuals on every change to the model.
	 *
	 */
	public class SensingflowLinkAdapter implements Adapter {

		/**
		 * Any change to the model causes refresh of the 
		 * {@link EditPart} visuals.
		 * @param notification the change that ocured in the model.
		 */
		@Override public void notifyChanged(Notification notification) {
			ImageData image = new ImageData("/home/dkim/cursor.gif");
      		Cursor tmp = new Cursor(getViewer().getControl().getDisplay(), image,0,0);
      		getViewer().getControl().setCursor(tmp);
			refreshVisuals();
		}

		/**
		 * {@inheritDoc}
		 */
		@Override public Notifier getTarget() {			
			return (SensingflowLink)getModel();
		}

		/**
		 * Does nothing.
		 */
		@Override public void setTarget(Notifier newTarget) {
			// Do nothing.
		}

		/**
		 * {@inheritDoc}
		 */
		@Override public boolean isAdapterForType(Object type) {
			return type.equals(SensingflowLink.class);
		}
	}
}
