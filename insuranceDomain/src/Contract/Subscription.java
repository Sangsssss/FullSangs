package Contract;

import java.util.ArrayList;
import java.util.StringTokenizer;

import domain.CheckStatus;

public class Subscription {
	
	private String empName;
	private String userIdx;
	private String iType;
	private String iName;
	private String period;
	private int fee;
	private ArrayList<String> contents;
	private CheckStatus checkSub;

	public Subscription(String inputString) {
		this.checkSub = CheckStatus.UNCHECK;
		StringTokenizer stringTokenizer = new StringTokenizer(inputString);
		this.empName = stringTokenizer.nextToken();
    	this.userIdx = stringTokenizer.nextToken();
    	this.iType = stringTokenizer.nextToken();
    	this.iName = stringTokenizer.nextToken();
    	String Sfee = stringTokenizer.nextToken();
    	fee = Integer.parseInt(Sfee);
    	this.period = stringTokenizer.nextToken();
    	this.contents = new ArrayList<String>();
    	while (stringTokenizer.hasMoreTokens()) {
    		this.contents.add(stringTokenizer.nextToken());
    	}
	}
	  public boolean matchId(String userId) {
	        return this.userIdx.equals(userId);
	    }
	  
	  public String getIType() {
		  return iType;
	  }
	  
	  public int getFee() {
		  return fee;
	  }
	  
	  public void checkSub(CheckStatus check) {
		  this.checkSub = check;
	 }
	 public String toString() {
	        String stringReturn =  this.empName + " " +  this.userIdx + " " +this.iType +" " + this.iName +  " " + this.period;
	        for (int i = 0; i < this.contents.size(); i++) {
	            stringReturn = stringReturn + " " + this.contents.get(i).toString();
	        }
	        return stringReturn;
	    }
	 
}
