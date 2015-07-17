package sensingflow.gef.editor.figure;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.swt.graphics.Color;

public class SensingflowLabelBorder extends AbstractBorder {
	
	private Color colorFg;
	
	public void setForegroundColor(Color rgb){
		colorFg = rgb;
	}
	
	public Insets getInsets(IFigure figure) {
		return new Insets(0, 0, 1, 0);
	}

	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		graphics.setLineWidth(3);
		Color colorTemp = graphics.getForegroundColor();
		if( colorFg != null )
			graphics.setForegroundColor(colorFg);
		graphics.drawLine(getPaintRectangle(figure, insets).getBottomLeft(), tempRect.getBottomRight());
		graphics.setForegroundColor(colorTemp);
	}
}
