package sensingflow.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import sensingflow.model.SensingflowFactory;
import sensingflow.model.SensingflowLink;

public class SensingflowLinkFactory implements CreationFactory {

	@Override public Object getNewObject() {
		return SensingflowFactory.eINSTANCE.createSensingflowLink();
	}

	@Override public Object getObjectType() {
		return SensingflowLink.class;
	}

}
