package sensingflow.gef.editor.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

public class SensingflowSensorFigure extends RoundedRectangle implements SensingflowThingFigure {
	public static Color colorFg = new Color(null, 91, 155, 213 );
	public static Color colorBg = new Color(null, 162, 192, 229 );
	public static Color colorText = new Color(null, 76, 76, 76 );
	private Label nameLabel;
	private RectangleFigure rectangle;
	private ConnectionAnchor connectionAnchor;
	private SensingflowLabelBorder labelBorder;


	public SensingflowSensorFigure() {
		ToolbarLayout layout = new ToolbarLayout();
	
		setLayoutManager(layout);
		setForegroundColor(colorFg);		
		setBackgroundColor(colorBg);
		
		setOpaque(true);
		labelBorder = new SensingflowLabelBorder();
		labelBorder.setForegroundColor(colorFg);
		Font classFont = new Font(null, "Arial", 11, SWT.BOLD);
		nameLabel = new Label();
		nameLabel.setFont(classFont);
		nameLabel.setBorder(labelBorder);
		nameLabel.setForegroundColor(colorText);
		add(nameLabel);
		
		rectangle = new RectangleFigure();
		rectangle.setLayoutManager(new XYLayout());
		rectangle.setOutline(false);
		rectangle.setAlpha(0);
		add(rectangle);

	}

	@Override
	public IFigure getContentPane() {
		return rectangle;
	}
	
	// @Override protected void paintFigure(Graphics graphics) {
	// Rectangle r = getBounds().getCopy();
	// setConstraint(rectangle, new Rectangle(0, 0, r.width, r.height));
	// setConstraint(nameLabel, new Rectangle(0, 0, r.width, r.height));
	// rectangle.setForegroundColor(ColorConstants.blue);
	// rectangle.setBorder(new LineBorder(2));
	// rectangle.invalidate();
	// nameLabel.invalidate();
	// }

	public Label getNameLabel() {
		return nameLabel;
	}

	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new ChopboxAnchor(this);
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