package sensingflow.gef.editor.part;

import org.eclipse.draw2d.IFigure;

import sensingflow.gef.editor.figure.SensingflowSensorFigure;

public class SensingflowSensorEditPart extends SensingflowThingEditPart {

	@Override 
	protected IFigure createFigure() {
		return new SensingflowSensorFigure();
	}
}
