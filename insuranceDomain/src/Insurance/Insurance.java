package Insurance;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.StringTokenizer;

import Accident.Accident;
import Contract.Contract;
import Employee.Employee;


public abstract class Insurance {

    private Long insuranceIdx;

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
    private ArrayList<String> contents;
    
    public Insurance(String inputString) {
    	StringTokenizer stringTokenizer = new StringTokenizer(inputString);
    	this.iType = stringTokenizer.nextToken();
    	this.iName = stringTokenizer.nextToken();
    	String sPeriod = stringTokenizer.nextToken();
    	period = Integer.parseInt(sPeriod);
    	String sFee = stringTokenizer.nextToken();
    	fee = Integer.parseInt(sFee);
    	String sMaxReward = stringTokenizer.nextToken();
    	maxReward = Integer.parseInt(sMaxReward);
    	this.contents = new ArrayList<String>();
    	while (stringTokenizer.hasMoreTokens()) {
    		this.contents.add(stringTokenizer.nextToken());
    	}
    }

	public String getIType() {
		return iType; 	
	}
	
	public String getIName() {
		return iName; 	
	}
	public String getContent() {
		String stringReturn = "";
		for (int i = 0; i < this.contents.size(); i++) {
            stringReturn = stringReturn + this.contents.get(i).toString() + " ";
        }
		return stringReturn;
	}
	
	public int getFee() {
		return fee; 	
	}
	public int getPeriod() {
		return period; 	
	}
	
	
	 public String toString() {
	        String stringReturn =  this.iType + " " +  this.iName + " " +this.period +" " + this.fee + " " +this.maxReward+ " " + this.contents;
	        return stringReturn;
	    }

    
}
