package User;

import java.util.ArrayList;
import java.util.List;

import domain.CheckStatus;
import repository.UserRepository;
import repository.UserSearch;

public class UserListImpl implements UserList{

    //private final UserRepository userRepository;
	

    @Override
    public void addUser(User user) {
       
    }


    
//    @Override
//    public void modifyCheckSug(Long userIdx) {
//        User findUser = userRepository.findOne(userIdx);
//        findUser.setCheckSug(CheckStatus.CHECK);
//    }
//
//    @Override
//    public void modifyCheckSub(Long userIdx) {
//        User findUser = userRepository.findOne(userIdx);
//        findUser.setCheckSub(CheckStatus.CHECK);
//    }
	@Override
    public ArrayList<User> findUserList() {
    	ArrayList<User> a= new ArrayList<>();
    	User user1 = new User("123", "Qwe", true, "qwe");
    	User user2 = new User("234", "Qwe", true, "qwe");
    	User user3 = new User("345", "Qwe", true, "qwe");
    	User user4 = new User("456", "Qwe", true, "qwe");
    	a.add(user1);	
    	a.add(user2);	
    	a.add(user3);	
    	a.add(user4);	
        return a;
    }
//
//    public User findUser(String userId) {
// 
//        return userRepository.findOne(userIdx);
//    }
    public String getUserData(String userId) {
       	ArrayList<User> a= new ArrayList<>();
    	User user1 = new User("123", "Qwe", true, "qwe");
    	User user2 = new User("234", "Qwe", true, "qwe");
    	User user3 = new User("345", "Qwe", true, "qwe");
    	User user4 = new User("456", "Qwe", true, "qwe");
    	a.add(user1);	
    	a.add(user2);	
    	a.add(user3);	
    	a.add(user4);
    		for (int i = 0; i < a.size(); i++) {
    			User user = (User) a.get(i);
    			if(user.matchId(userId)) {
    				return user.toStringAll();
    			}
    		}
    	return "고객을 찾을 수 없다";    	
    }
//
//    @Override
//    public List<User> findCheckUwUserList(UserSearch userSearch) {
//        return userRepository.findCheckUwUserList(userSearch);
//    }
//
//    @Override
//    public List<User> findDelinquentList() {
//        return userRepository.findDelinquentList();
//    }
//
//    @Override
//    public List<User> findMaturityUserList() {
//        return userRepository.findMaturityUserList();
//
//    }
    
}
