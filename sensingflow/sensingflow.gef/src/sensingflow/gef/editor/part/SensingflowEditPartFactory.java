package sensingflow.gef.editor.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import sensingflow.model.SensingflowInPort;
import sensingflow.model.SensingflowLink;
import sensingflow.model.SensingflowOutPort;
import sensingflow.model.SensingflowProcessor;
import sensingflow.model.SensingflowSensor;
import sensingflow.model.SensingflowTask;

public class SensingflowEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;

		if (model instanceof SensingflowProcessor) {
			part = new SensingflowProcessorEditPart();
		} else if (model instanceof SensingflowSensor) {
			part = new SensingflowSensorEditPart();
		} else if (model instanceof SensingflowTask) {
			part = new SensingflowTaskEditPart();
		} else if (model instanceof SensingflowInPort) {
			part = new SensingflowInPortEditPart();
		} else if (model instanceof SensingflowOutPort) {
			part = new SensingflowOutPortEditPart();
		} else if (model instanceof SensingflowLink) {
			part = new SensingflowLinkEditPart();
		} else {
			throw new IllegalArgumentException("Model class " + model.getClass() + " not supported yet.");
		}

		if (part != null) {
			part.setModel(model);
		}

		return part;
	}
}
