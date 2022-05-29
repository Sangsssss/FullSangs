package Contract;

import java.util.ArrayList;

public interface ContractList {


    //Create
    public void addContract(Contract contract);  //



    public String getSuggestion(String currentUser);
    public Subscription getSubscription(String userId);

	public void addSuggestion(int i);
	public void addSubscription(int i);
}
