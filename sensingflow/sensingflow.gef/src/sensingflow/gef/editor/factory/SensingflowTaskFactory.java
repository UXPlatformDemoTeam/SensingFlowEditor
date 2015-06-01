package sensingflow.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sensingflow.model.SensingflowFactory;
import sensingflow.model.SensingflowTask;

public class SensingflowTaskFactory implements CreationFactory {

	@Override public Object getNewObject() {
		return SensingflowFactory.eINSTANCE.createSensingflowTask();
	}

	@Override public Object getObjectType() {
		return SensingflowTask.class;
	}

}
