package sensingflow.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sensingflow.model.SensingflowFactory;
import sensingflow.model.SensingflowOutPort;

public class SensingflowOutPortFactory implements CreationFactory {

	@Override public Object getNewObject() {
		return SensingflowFactory.eINSTANCE.createSensingflowOutPort();
	}

	@Override public Object getObjectType() {
		return SensingflowOutPort.class;
	}

}
