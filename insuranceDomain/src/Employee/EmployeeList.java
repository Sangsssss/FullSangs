package Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface EmployeeList {


	public String getEmpName();
	public void addSuggestion(int i, String userIdx);
    //Create
	public void addSubscription(int i) throws IOException;
	
	public String sendSuggestion(int i);


    //Read
    //public List<Employee> findSalesmanList();


    //Update

}
