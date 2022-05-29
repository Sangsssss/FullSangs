package Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Contract.Subscription;
import Contract.Suggestion;

public interface EmployeeList {


	public String getEmpName();
	public void writeSuggestion(int i, String userIdx);
	public void writeSubscription(int i, String userIdx);
    //Create
	
	
	
	public Suggestion sendSuggestion(int i);
	public Subscription sendSubscription(int i);


    //Read
    //public List<Employee> findSalesmanList();


    //Update

}
