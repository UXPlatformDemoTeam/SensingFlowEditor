package sensingflow.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sensingflow.model.SensingflowFactory;
import sensingflow.model.SensingflowSensor;

public class SensingflowSensorFactory implements CreationFactory {

	@Override public Object getNewObject() {
		return SensingflowFactory.eINSTANCE.createSensingflowSensor();
	}

	@Override public Object getObjectType() {
		return SensingflowSensor.class;
	}

}
