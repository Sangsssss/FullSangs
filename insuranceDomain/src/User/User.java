package User;

import Accident.Accident;
import Contract.Contract;
import domain.Address;
import domain.CheckStatus;

public class User {

    private Long userIdx;

    private Address address;


    private CheckStatus checkSug;


    private CheckStatus checkSub;

    private String email;
    private String id;
    private String job;
    private String name;
    private String pw;
    private boolean sex;
    private String ssn;
    private String tel;
    public Contract contract;
    public Accident accident;
    public User(String userId, String userName, boolean sex, String job) {
    	this.id = userId;
    	this.name = userName;
    	this.sex = sex;
    	this.job = job;   	
    }

    public String toString() {
        String stringReturn =  this.id + " " + this.name;
        return stringReturn;
    }
    public String toStringAll() {
        String stringReturn =  this.id + " " + this.name+ " " + this.sex+ " " + this.job;
        return stringReturn;
    }
    
    public String getUserIdx() {
    	return id;
    }
    
    public boolean matchId(String userId) {
        return this.id.equals(userId);
    }
}
