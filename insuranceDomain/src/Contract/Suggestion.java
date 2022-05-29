package Contract;

import java.util.ArrayList;
import java.util.StringTokenizer;

import domain.CheckStatus;

public class Suggestion {
	
	private String empName;
	private String userIdx;
	private String iType;
	private String iName;
	private String fee;
	private String period;
	private ArrayList<String> contents;
	private CheckStatus checkSug;
	

	public Suggestion(String inputString) {
		this.checkSug = CheckStatus.UNCHECK;
		StringTokenizer stringTokenizer = new StringTokenizer(inputString);
		this.empName = stringTokenizer.nextToken();
    	this.userIdx = stringTokenizer.nextToken();
    	this.iType = stringTokenizer.nextToken();
    	this.iName = stringTokenizer.nextToken();
    	this.fee = stringTokenizer.nextToken();
    	this.period = stringTokenizer.nextToken();
    	this.contents = new ArrayList<String>();
    	while (stringTokenizer.hasMoreTokens()) {
    		this.contents.add(stringTokenizer.nextToken());
    	}
	}
	  public boolean matchId(String userId) {
	        return this.userIdx.equals(userId);
	    }
	  
	  public void checkSug(CheckStatus check) {
		  this.checkSug = check;
	 }
	
	  
	 public String toString() {
	        String stringReturn =  this.empName + " " +  this.userIdx + " " +this.iType +" " + this.iName + " " +this.fee+ " " + this.period;
	        for (int i = 0; i < this.contents.size(); i++) {
	            stringReturn = stringReturn + " " + this.contents.get(i).toString();
	        }
	        return stringReturn;
	    }
	 
	
	
}
