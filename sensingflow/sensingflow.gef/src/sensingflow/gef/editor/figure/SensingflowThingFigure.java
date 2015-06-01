package sensingflow.gef.editor.figure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;

public interface SensingflowThingFigure extends SensingflowNodeFigure {
	public Label getNameLabel();
	/**
	 * The figure on which this figure's childs should be added
	 * instead of adding them directory.
	 * @return a figure on which child figures can be added.
	 */
	public IFigure getContentPane();
}
