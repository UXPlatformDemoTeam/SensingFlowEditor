package sensingflow.gef.editor.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

public class SensingflowInPortFigure extends Figure implements SensingflowPortFigure {
	private Label nameLabel;
	private RectangleFigure rectangle;
	private ConnectionAnchor connectionAnchor;
	public static Color classColor = new Color(null,255,255,0);

	public SensingflowInPortFigure() {
		ToolbarLayout layout = new ToolbarLayout(true);
		layout.setSpacing(2);
		setLayoutManager(layout);
		setOpaque(true);

		rectangle = new RectangleFigure();
		rectangle.setOutline(false);
		rectangle.setSize(12,12);
		rectangle.setBorder(new LineBorder(ColorConstants.blue, 2));
		add(rectangle);
		Font classFont = new Font(null, "Arial", 9, SWT.BOLD);
        nameLabel = new Label();
        nameLabel.setFont(classFont);
        nameLabel.setText("In");
        add(nameLabel);
	}
	
	@Override
	public IFigure getContentPane() {
	    return rectangle;
	}
	
	@Override protected void paintFigure(Graphics graphics) {
		//Rectangle r = getBounds().getCopy();
		//setConstraint(rectangle, new Rectangle(0, 0, 100, 100));
		//setConstraint(nameLabel, new Rectangle(0, 0, r.width, r.height));
//		rectangle.setForegroundColor(ColorConstants.blue);
//		rectangle.setBorder(new LineBorder(2));
	//	rectangle.invalidate();
        //nameLabel.invalidate();     
	}
	
	public Label getNameLabel() {
		return nameLabel;
	}
	
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new ChopboxAnchor(this.rectangle);
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