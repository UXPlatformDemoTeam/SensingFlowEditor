package sensingflow.gef.editor.part;

import org.eclipse.draw2d.IFigure;

import sensingflow.gef.editor.figure.SensingflowTaskFigure;

public class SensingflowTaskEditPart extends SensingflowThingEditPart {

	@Override protected IFigure createFigure() {
		return new SensingflowTaskFigure();
	}
}
