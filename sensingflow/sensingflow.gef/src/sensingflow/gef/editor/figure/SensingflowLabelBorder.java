package sensingflow.gef.editor.figure;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;

public class SensingflowLabelBorder extends AbstractBorder {
	public Insets getInsets(IFigure figure) {
		return new Insets(0, 0, 1, 0);
	}

	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		graphics.setLineWidth(3);
		graphics.drawLine(getPaintRectangle(figure, insets).getBottomLeft(), tempRect.getBottomRight());
	}
}
