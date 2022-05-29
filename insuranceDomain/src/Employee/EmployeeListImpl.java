package Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Contract.ContractList;
import Contract.ContractListImpl;
import Insurance.InsuranceList;
import Insurance.InsuranceListImpl;


	public class EmployeeListImpl implements EmployeeList{
	static InsuranceList insurance = new InsuranceListImpl();
	static ContractList contract = new ContractListImpl();
	static ArrayList<Suggestion> suggestions;
	BufferedReader objReader = new BufferedReader(new InputStreamReader(System.in));
    //private final EmployeeRepository employeeRepository;
	
	public void addSuggestion(int i, String userIdx) {
		suggestions = new ArrayList<Suggestion>();
		suggestions.add(new Suggestion(this.getEmpName() + " " + userIdx + " " +insurance.getIType(i)+ " " + insurance.getIName(i)+ " " + insurance.getFee(i)
		+ " " + insurance.getPeriod(i) + " " +  insurance.getContent(i)));
		System.out.println(suggestions.get(0).toString());
		
	}
	
//    @Override
//    public List<Employee> findSalesmanList() {
//        return employeeRepository.findAll();
//    }
	public String getEmpName() {
		return "이상원";
	}

	@Override
	public void addSubscription(int i) throws IOException {
		System.out.println("--------------청약서--------------");	
		System.out.println("                    보험설계사 "+  this.getEmpName());
		System.out.println("보험 종류 : " + insurance.getIType(i) + " | " + "보험 이름 : " + insurance.getIName(i));
		
		if(insurance.getIType(i).contains("화재")) {
		System.out.print("건물 개수 : ");
		System.out.print("건물 금액 : "); 
		}
		
	}

	public String sendSuggestion(int i) {
	   return suggestions.get(i).toString();
	}
}
