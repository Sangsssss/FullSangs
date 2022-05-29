package Contract;

import java.util.ArrayList;

import Employee.EmployeeList;
import Employee.EmployeeListImpl;


public class ContractListImpl implements ContractList{

    static EmployeeList employee = new EmployeeListImpl();
    ArrayList<String> suggestions;
   
    @Override
    public void addContract(Contract contract) {
//        contractRepository.save(contract);
    }


	public void addSuggestion(int i) {
		suggestions = new ArrayList<String>();
		suggestions.add(employee.sendSuggestion(i));
		System.out.println(suggestions.get(i));
	}


	public String getSuggestion(String userId) {
		for(int i = 0; i<this.suggestions.size(); i++) {
			if(suggestions.get(i).matchId(userId)) {
				
			}
		}
		
		
	}




}
