package sensingflow.gef.editor.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class SensingflowTaskFigure extends Figure implements SensingflowThingFigure {
	private Label nameLabel;
	private RectangleFigure rectangle;
	private ConnectionAnchor connectionAnchor;	
	
	public SensingflowTaskFigure() {
		setLayoutManager(new XYLayout());
        nameLabel = new Label();
        add(nameLabel);
        rectangle = new RectangleFigure();
        rectangle.setLayoutManager(new XYLayout());
        rectangle.setFill(false);
		add(rectangle);
	}
	
	@Override
	public IFigure getContentPane() {
	    return rectangle;
	}

	@Override protected void paintFigure(Graphics graphics) {
		Rectangle r = getBounds().getCopy();
		setConstraint(rectangle, new Rectangle(0, 0, r.width, r.height));
		setConstraint(nameLabel, new Rectangle(0, 0, r.width, r.height));
		rectangle.setForegroundColor(ColorConstants.black);
		rectangle.setBorder(new LineBorder(2));
		rectangle.invalidate();
		nameLabel.invalidate();
	}
	
	public Label getNameLabel() {
		return nameLabel;
	}
	
	/**
	 * Creates an {@link EllipseAnchor} on the figure.
	 * @return an {@link EllipseAnchor} on the figure.
	 */
	private ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new EllipseAnchor(this);
		}
		return connectionAnchor;
	}

    @Override
    public ConnectionAnchor getSourceConnectionAnchor() {
        return getConnectionAnchor();
    }

    @Override
    public ConnectionAnchor getTargetConnectionAnchor() {
        return getConnectionAnchor();
    }		
    
    @Override
    protected boolean useLocalCoordinates() {
        return true;
    }
}
