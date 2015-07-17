package sensingflow.gef.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeListener;
import org.eclipse.gef.Request;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.jface.viewers.TextCellEditor;

import sensingflow.gef.editor.figure.SensingflowPortFigure;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowPort;
import sensingflow.model.impl.SensingflowOutPortImpl;

public abstract class SensingflowPortEditPart extends SensingflowNodeEditPart {

	public SensingflowPortEditPart() {
		super();
		
		NodeListener listener = new NodeListener()
		{

			@Override
			public void removingSourceConnection(ConnectionEditPart connection,
					int index) {
				SensingflowPortFigure figure = (SensingflowPortFigure)getFigure();
				figure.setConnection(false);
			}

			@Override
			public void removingTargetConnection(ConnectionEditPart connection,
					int index) {		
				SensingflowPortFigure figure = (SensingflowPortFigure)getFigure();
				figure.setConnection(false);
			}

			@Override
			public void sourceConnectionAdded(ConnectionEditPart connection,
					int index) {
				SensingflowPortFigure figure = (SensingflowPortFigure)getFigure();
				figure.setConnection(true);
			}

			@Override
			public void targetConnectionAdded(ConnectionEditPart connection,
					int index) {	
				SensingflowPortFigure figure = (SensingflowPortFigure)getFigure();
				figure.setConnection(true);
			}
			
			
		};
		
		addNodeListener(listener);
	}
	
	@Override protected void createEditPolicies() {
	    super.createEditPolicies();
		//installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new SensingflowPortDirectEditPolicy());
        installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());		
	}

	@Override protected void refreshVisuals() {
		SensingflowPortFigure figure = (SensingflowPortFigure)getFigure();
		SensingflowPort model = (SensingflowPort)getModel();
		GraphicalEditPart parent = (GraphicalEditPart) getParent();
		
		if (model.getClass().equals(SensingflowOutPortImpl.class))
			figure.getNameLabel().setText("   OUT");
		else
			figure.getNameLabel().setText("IN");
		parent.setLayoutConstraint(this, figure, model.getConstraints());
	}

	@Override public void performRequest(Request req) {
//		if(req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
//			performDirectEditing();
//		}
	}
	
	private void performDirectEditing() {
		Label label = ((SensingflowPortFigure)getFigure()).getNameLabel();
		SensingflowPortDirectEditManager manager = new SensingflowPortDirectEditManager(this, TextCellEditor.class, new SensingflowPortCellEditorLocator(label), label);
		manager.show();
	}
	
    
    @Override
    public IFigure getContentPane() {
        return ((SensingflowPortFigure)getFigure()).getContentPane();
    }
    
    /**
     * Currently the class only adapts to create a {@link SnapToHelper}
     * when the editor is in snapping mode (either to grid or to shapes).
     */
    @Override public Object getAdapter(Class key) {
        if (key == SnapToHelper.class) {
            List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
            if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED))) {
                helpers.add(new SnapToGeometry(this));
            }
            if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED))) {
                helpers.add(new SnapToGrid(this));
            }
            if(helpers.size()==0) {
                return null;
            } else {
                return new CompoundSnapToHelper(helpers.toArray(new SnapToHelper[0]));
            }
        }
        return super.getAdapter(key);
    }   
    

    
}
