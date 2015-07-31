package sensingflow.gef.editor.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

public class SensingflowOutPortFigure extends Figure implements SensingflowPortFigure {
	private Label nameLabel;
	private Ellipse ellipse;
	private ConnectionAnchor connectionAnchor;
	public static Color colorFgCon = new Color(null, 80, 156, 50 );
	public static Color colorBgCon = new Color(null, 112, 173, 71 );
	public static Color colorFg = new Color(null, 165, 165, 165 );
	public static Color colorBg = new Color(null, 200, 200, 200 );
	public static Color colorText = new Color(null, 76, 76, 76 );
	
	public SensingflowOutPortFigure() {
		ToolbarLayout layout = new ToolbarLayout(true);
		layout.setSpacing(2);
		setLayoutManager(layout);
		setOpaque(true);
		
		Font classFont = new Font(null, "Arial", 9, SWT.NORMAL);
		nameLabel = new Label();
        nameLabel.setFont(classFont);
        nameLabel.setForegroundColor(colorText);
        add(nameLabel);
		ellipse = new Ellipse();
		ellipse.setForegroundColor(colorFg);
		ellipse.setBackgroundColor(colorBg);
		ellipse.setSize(11, 11);
		add(ellipse);
        
	}
	
	@Override
	public IFigure getContentPane() {
	    return ellipse;
	}
	
	public void setConnection(boolean b){
		if( b )
		{
			ellipse.setForegroundColor(colorFgCon);
			ellipse.setBackgroundColor(colorBgCon);
		}
		else
		{
			ellipse.setForegroundColor(colorFg);
			ellipse.setBackgroundColor(colorBg);		
		}
	}
	
	@Override protected void paintFigure(Graphics graphics) {
//		Rectangle r = getBounds().getCopy();
//		setConstraint(ellipse, new Rectangle(0, 0, r.width, r.height));
//		setConstraint(nameLabel, new Rectangle(0, 0, r.width, r.height));
//		ellipse.setForegroundColor(ColorConstants.red);
//		//ellipse.setBackgroundColor(ColorConstants.darkGray);
//		ellipse.setBorder(new LineBorder(2));
//		ellipse.invalidate();
//        nameLabel.invalidate();     
	}
	
	public Label getNameLabel() {
		return nameLabel;
	}
	
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new ChopboxAnchor(this.ellipse);
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