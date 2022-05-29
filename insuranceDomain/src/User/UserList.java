package User;

import java.util.ArrayList;

public interface UserList {
	
    //Create
    public void addUser(User user); 

    public ArrayList<User> findUserList();

//    public User findUser(String userId);

	public String getUserData(String uchoice);

	 public String getUserIdx(String userId);


 /*
    //Update
    public void modifyCheckSug(Long userIdx); 
    public void modifyCheckSub(Long userIdx); 


    //Read
    public List<User> findUserList();
    public User findUser(Long userIdx);
    public List<User> findCheckUwUserList(UserSearch userSearch);
    public List<User> findDelinquentList();
    public List<User> findMaturityUserList();
    */


}
