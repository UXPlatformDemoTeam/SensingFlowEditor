package sensingflow.gef.editor.part;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;

import sensingflow.gef.editor.policy.SensingflowContainerXYLayoutPolicy;
import sensingflow.model.SensingflowNode;
import sensingflow.model.SensingflowProcessor;

public class SensingflowProcessorEditPart extends AbstractGraphicalEditPart {

	private SensingflowProcessorAdapter adapter;
	
	public SensingflowProcessorEditPart() {
		super();
		adapter = new SensingflowProcessorAdapter();
	}
	
	@Override 
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		layer.setLayoutManager(new FreeformLayout());
		layer.setBorder(new LineBorder(1));
		return layer;
	}

	@Override 
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new SensingflowContainerXYLayoutPolicy());
        installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
	}
	
	@Override protected List<SensingflowNode> getModelChildren() {
		SensingflowProcessor spd = (SensingflowProcessor) getModel();
		List<SensingflowNode> nodes = new ArrayList<SensingflowNode>(spd.getNodes());
		return nodes;
	}
	
	@Override public void activate() {
		if(!isActive()) {
			((SensingflowProcessor)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}


	@Override public void deactivate() {
		if(isActive()) {
			((SensingflowProcessor)getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
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
	
	public class SensingflowProcessorAdapter implements Adapter {

		@Override public void notifyChanged(Notification notification) {
			refreshChildren();
		}

		@Override public Notifier getTarget() {
			return (SensingflowProcessor)getModel();
		}

		@Override public void setTarget(Notifier newTarget) {
			// Do nothing.
		}

		@Override public boolean isAdapterForType(Object type) {
			return type.equals(SensingflowProcessor.class);
		}
	}	
	
}
