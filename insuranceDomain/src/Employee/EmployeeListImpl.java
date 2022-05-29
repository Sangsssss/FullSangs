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
		return "�̻��";
	}

	@Override
	public void addSubscription(int i) throws IOException {
		System.out.println("--------------û�༭--------------");	
		System.out.println("                    ���輳��� "+  this.getEmpName());
		System.out.println("���� ���� : " + insurance.getIType(i) + " | " + "���� �̸� : " + insurance.getIName(i));
		
		if(insurance.getIType(i).contains("ȭ��")) {
		System.out.print("�ǹ� ���� : ");
		System.out.print("�ǹ� �ݾ� : "); 
		}
		
	}

	public String sendSuggestion(int i) {
	   return suggestions.get(i).toString();
	}
}
