package sensingflow.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sensingflow.model.SensingflowFactory;
import sensingflow.model.SensingflowInPort;

public class SensingflowInPortFactory implements CreationFactory {

	@Override public Object getNewObject() {
		return SensingflowFactory.eINSTANCE.createSensingflowInPort();
	}

	@Override public Object getObjectType() {
		return SensingflowInPort.class;
	}

}
