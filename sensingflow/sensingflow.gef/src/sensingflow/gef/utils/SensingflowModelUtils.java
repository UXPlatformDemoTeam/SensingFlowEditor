package sensingflow.gef.utils;

import sensingflow.model.SensingflowFactory;
import sensingflow.model.SensingflowLink;
import sensingflow.model.SensingflowSensor;
import sensingflow.model.SensingflowTask;
import sensingflow.model.SensingflowProcessor;

public enum SensingflowModelUtils {
	INSTANCE;
	
	private SensingflowFactory factory = SensingflowFactory.eINSTANCE;
	
	public SensingflowProcessor createModel() {
		SensingflowProcessor spd = factory.createSensingflowProcessor();
		SensingflowSensor Sensor1 = factory.createSensingflowSensor();
		Sensor1.setName("O1");
		spd.getNodes().add(Sensor1);
		SensingflowSensor Sensor2 = factory.createSensingflowSensor();
		Sensor2.setName("O2");
		spd.getNodes().add(Sensor2);
		SensingflowTask process = factory.createSensingflowTask();
		process.setName("P1");
		spd.getNodes().add(process);
		SensingflowLink link = factory.createSensingflowLink();
		link.setSource(Sensor1);
		link.setTarget(process);
		spd.getLinks().add(link);
		return spd;
	}
}
