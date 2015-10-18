package co.guiduck.scope;
import java.util.Map;

import co.guiduck.data.Data;


public class Scope {
	private Map<String, Data> variables;
	private int returnAddress;
	
	public Scope(Map<String, Data> variables, int returnAddress) {
		this.variables = variables;
		this.returnAddress = returnAddress;
	}
	
	public Object getData(String var) {
		return variables.get(var);
	}
	
	public boolean containsVar(String var) {
		return variables.containsKey(var);
	}

}
