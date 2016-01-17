package maven.com.whoeveryou;

import com.opensymphony.xwork2.ActionSupport;

public class Computing extends ActionSupport{

	public int getParameterNoOne() {
		return parameterNoOne;
	}

	public void setParameterNoOne(int parameterNoOne) {
		this.parameterNoOne = parameterNoOne;
	}

	public int getParameterNoTwo() {
		return parameterNoTwo;
	}

	public void setParameterNoTwo(int parameterNoTwo) {
		this.parameterNoTwo = parameterNoTwo;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	private int parameterNoOne=0;
	private int parameterNoTwo=0;
	private String result="";

	@Override
	public String execute() throws Exception{
		DataService ds=new DataService();
		setResult("Result: "+Integer.toString(ds.addParameters(parameterNoOne, parameterNoTwo)));
		return SUCCESS;
	}

}