package sensingflow.gef.editor.part;

import org.eclipse.draw2d.IFigure;

import sensingflow.gef.editor.figure.SensingflowInPortFigure;

public class SensingflowInPortEditPart extends SensingflowPortEditPart {

	@Override
	protected IFigure createFigure() {
		return new SensingflowInPortFigure();
	}
}
