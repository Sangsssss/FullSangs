package Contract;

import java.util.ArrayList;

import Employee.EmployeeList;
import Employee.EmployeeListImpl;
import Insurance.InsuranceList;
import Insurance.InsuranceListImpl;
import domain.CheckStatus;


public class ContractListImpl implements ContractList{

    static EmployeeList employee = new EmployeeListImpl();
    static InsuranceList insurance = new InsuranceListImpl();
    ArrayList<Suggestion> suggestions = new ArrayList<Suggestion>();
    ArrayList<Subscription> subscriptions = new ArrayList<Subscription>();
   
    @Override
    public void addContract(Contract contract) {
//        contractRepository.save(contract);
    }


	public void addSubscription(int i) {
		subscriptions.add(employee.sendSubscription(i));
		System.out.println(suggestions.get(i));
		
	}
	
	public void addSuggestion(int i) {
		suggestions.add(employee.sendSuggestion(i));
		System.out.println(suggestions.get(i));
		
	}


	public String getSuggestion(String userId) {
		String cSuggestion = null;
		for(int i = 0; i<this.suggestions.size(); i++) {
			if(suggestions.get(i).matchId(userId)) {
				cSuggestion = suggestions.get(i).toString();
				suggestions.get(i).checkSug(CheckStatus.CHECK);
			}else {
				return "Idx 불일치";
			}
		}
		return cSuggestion;
	
		
	}
	public Subscription getSubscription(String userId) {
		Subscription cSubscription = null;
		for(int i = 0; i<this.subscriptions.size(); i++) {
			if(subscriptions.get(i).matchId(userId)) {
				cSubscription = subscriptions.get(i);
				subscriptions.get(i).checkSub(CheckStatus.CHECK);
			}else {
				return null;
			}
		}
		return cSubscription;	
		
	}





}
