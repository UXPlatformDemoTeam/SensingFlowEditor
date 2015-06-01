package sensingflow.gef.editor.part;

import org.eclipse.draw2d.IFigure;

import sensingflow.gef.editor.figure.SensingflowOutPortFigure;

public class SensingflowOutPortEditPart extends SensingflowPortEditPart {

	@Override 
	protected IFigure createFigure() {
		return new SensingflowOutPortFigure();
	}
}
