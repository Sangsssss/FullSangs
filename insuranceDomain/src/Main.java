import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Insurance.InsuranceList;
import Insurance.InsuranceListImpl;
import User.User;
import User.UserList;
import User.UserListImpl;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader objReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		printWindow();
		String sChoice = objReader.readLine().trim();
		switch(sChoice) {
		case "1" : 
			UserList userList = new UserListImpl();
			ArrayList<User> a = userList.findUserList();
			String list = "";
	        for(int i=0; i<a.size(); i++) {
	        list += a.get(i).toString() + "\n";
	        }
			System.out.println(list);	
			System.out.println("*******고객을 선택해주세요.*******");
			String uchoice = objReader.readLine().trim();
			System.out.println(userList.getUserData(uchoice));
			break;

	//-----------------------------------------------------------------------------------------------	
		case "3" : developIn(objReader);
		    break;
		    default :
		    	System.out.println("*******존재하지 않는 항목입니다.*******");
	//----------------------------------------------------------------------------------------------	    	
		    	
			}
		}
	}
	private static void developIn(BufferedReader objReader) throws IOException {
		System.out.println("개발하실 보험을 입력해주세요");
				   System.out.println("화재보험개발,실손의료비보험개발,자동차보험개발,여행보험개발");		
				   System.out.println("3-2. 실손의료비보험개발");
				   System.out.println("3-3. 자동차보험개발");
				   System.out.println("3-4. 여행보험개발");
				   String iType = "";
				   String s2Choice = objReader.readLine().trim();
				   switch(s2Choice) {
				   case "1" :  
					   	iType = "화재";
				   break;
				   case "2" :  System.out.println("실손의료비보험개발");	
				   		iType = "실손의료비";
				   break;
				   case "3" :  System.out.println("자동차보험개발");	
				   iType = "자동차";
				   break;
				   case "4" :  System.out.println("여행보험개발");	
				   iType = "여행";
				   break;
				   default :
				    	System.out.println("*******존재하지 않는 항목입니다.*******");
				   }
				   System.out.println("---------개발할 보험 내용을 입력해주세요---------");
				   System.out.println("보험명 : "); String iName = objReader.readLine().trim();
				   System.out.println("보장내용 : "); String content = objReader.readLine().trim();
				   System.out.println("기간 : "); String period = objReader.readLine().trim();
				   System.out.println("보험료 : "); String fee = objReader.readLine().trim();
				   System.out.println("최대보장금액 : "); String maxReward = objReader.readLine().trim();
			InsuranceList insuranceList = new InsuranceListImpl();
			insuranceList.idevelop(iType,iName, content, period, fee, maxReward);
	}
	private static void printWindow() {
		System.out.println("1. 계약");
		System.out.println("2. 로그인"); //후순위
		System.out.println("3. 보험개발"); //
		System.out.println("4. 보험 계약");
		System.out.println("5. 사고 신고");
	}
}
