package Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Contract.ContractList;
import Contract.ContractListImpl;
import Contract.Subscription;
import Contract.Suggestion;
import Insurance.InsuranceList;
import Insurance.InsuranceListImpl;


	public class EmployeeListImpl implements EmployeeList{
	static InsuranceList insurance = new InsuranceListImpl();
	static ContractList contract = new ContractListImpl();
	static ArrayList<Suggestion> suggestions = new ArrayList<Suggestion>();
	static ArrayList<Subscription> subscriptions = new ArrayList<Subscription>();
	BufferedReader objReader = new BufferedReader(new InputStreamReader(System.in));
    //private final EmployeeRepository employeeRepository;
	
	public void writeSuggestion(int i, String userIdx) {
		suggestions.add(new Suggestion(this.getEmpName() + " " + userIdx + " " +insurance.getIType(i)+ " " + insurance.getIName(i)+ " " + insurance.getFee(i)
		+ " " + insurance.getPeriod(i) + " " +  insurance.getContent(i)));
		System.out.println(suggestions.get(0).toString());
	}
	
	public void writeSubscription(int i, String userIdx) {
		subscriptions.add(new Subscription(this.getEmpName() + " " + userIdx + " " +insurance.getIType(i)+ " " + insurance.getIName(i)+ " " + insurance.getFee(i)+
		 " " + insurance.getPeriod(i) + " " +  insurance.getContent(i)));
		System.out.println(subscriptions.get(0).toString());
	}
	
//    @Override
//    public List<Employee> findSalesmanList() {
//        return employeeRepository.findAll();
//    }
	public String getEmpName() {
		return "ÀÌ»ó¿ø";
	}


	public Suggestion sendSuggestion(int i) {
		   return suggestions.get(i);
		}
	public Subscription sendSubscription(int i) {
		   return subscriptions.get(i);
		}
}
