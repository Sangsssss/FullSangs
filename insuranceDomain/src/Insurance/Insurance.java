package Insurance;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

import Accident.Accident;
import Contract.Contract;
import Employee.Employee;


public abstract class Insurance {

    private Long insuranceIdx;

    private String content;
    private String iType;
    private String iName;
    private int fee;
    private int maxReward;
    private int period;
    private int rate;
    private int employeeIdx;

    public Contract contract;
    public Accident accident;

    private Employee employee;
    
    public Insurance(String inputString) {
    	StringTokenizer stringTokenizer = new StringTokenizer(inputString);
    	this.iType = stringTokenizer.nextToken();
    	this.iName = stringTokenizer.nextToken();
    	this.content = stringTokenizer.nextToken();
    	String sPeriod = stringTokenizer.nextToken();
    	period = Integer.parseInt(sPeriod);
    	String sFee = stringTokenizer.nextToken();
    	fee = Integer.parseInt(sFee);
    	String sMaxReward = stringTokenizer.nextToken();
    	maxReward = Integer.parseInt(sMaxReward);
    }

	public String getIType() {
		return iType; 
		
	}
	 public String toString() {
	        String stringReturn =  this.iType + " " +  this.iName + " " + this.content + " " +this.period +" " + this.fee + " " +this.maxReward;
	        return stringReturn;
	    }

    
}
