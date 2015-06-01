package sensingflow.gef.editor;

public class SensingflowConnInfo {
	private String FromID;
	private String FromIf;
	private String ToID;
	private String ToIf;
	
	void setFromID(String val)
	{
		FromID = val;
	}
	void setFromIf(String val)
	{
		FromIf = val;
	}
	void setToID(String val)
	{
		ToID = val;
	}
	void setToIf(String val)
	{
		ToIf = val;
	}
	String getFromID()
	{
		return FromID;
	}
	String getFromIf()
	{
		return FromIf;
	}
	String getToID()
	{
		return ToID;
	}
	String getToIf()
	{
		return ToIf;
	}
	

}
