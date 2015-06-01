package sensingflow.gef.editor;

public class SensingflowThingInfo {
	private String name;
	private String logic;
	private String InstantParam;
	private String DeviceId;
	private String numInput;
	private String numOutput;
	private String numOutputSize;
	private String type;

	public String getNumOutputSize() {
		return numOutputSize;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String getlogic() {
		return logic;
	}

	public String getInstantParam() {
		return InstantParam;
	}

	public String getDeviceId() {
		return DeviceId;
	}

	public String getNumInput() {
		return numInput;
	}

	public String getNumOutput() {
		return numOutput;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLogic(String logic) {
		this.logic = logic;
	}

	public void setInstantParam(String param) {
		this.InstantParam = param;
	}

	public void setDeviceId(String ID) {
		this.DeviceId = ID;
	}

	public void setNumInput(String input) {
		this.numInput = input;
	}

	public void setNumOutput(String output) {
		this.numOutput = output;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setNumOutputSize(String size) {
		this.numOutputSize = size;
	}

}
