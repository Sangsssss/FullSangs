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
	static InsuranceList insurance = new InsuranceListImpl();
	static UserList user = new UserListImpl();
	public static void main(String[] args) throws IOException {
		BufferedReader objReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		printWindow();
		String sChoice = objReader.readLine().trim();
		switch(sChoice) {
		case "1" : 
			
			ArrayList<User> a = user.findUserList();
			String list = "";
	        for(int i=0; i<a.size(); i++) {
	        list += a.get(i).toString() + "\n";
	        }
			System.out.println(list);	
			System.out.println("*******고객을 선택해주세요.*******");
			String uchoice = objReader.readLine().trim();
			System.out.println(user.getUserData(uchoice));
			//버튼 클릭시?
			System.out.println("계약을 계속 진행하시겠습니까?");
			System.out.println("1. 예");
			System.out.println("2. 아니오");
			switch(objReader.readLine().trim()) {
			case "1": 
			System.out.println("보험 상품을 선택해주세요.");
			
			//
//			for(int i = 0; i<list.length(); i++) {
//				System.out.println((i+1) + list.get(i).getIName());
//			}
			System.out.println("1. 건강보험");
			System.out.println("2. 자동차보험");
			String iChoice = objReader.readLine().trim();
			switch(iChoice) {
			case "1" : System.out.println("--------------가입설계서--------------");	   
			System.out.println(insurance.getInsurance(0));
			System.out.println("-----------------------------------");	
			//전송 버튼 클릭시
			System.out.println("전송하기 YES/NO");	
			if(objReader.readLine().equals("YES")) {
				System.out.println("전송이 완료되었습니다.");	
			}
			
			break;
			case "2" : 
				break;
			}
			
			}
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
				   case "1" :  System.out.println("화재보험개발");	
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
				  
				   insurance.idevelop(iType,iName, content, period, fee, maxReward);
	}
	private static void printWindow() {
		System.out.println("1. 계약");
		System.out.println("2. 로그인"); //후순위
		System.out.println("3. 보험개발"); //
		System.out.println("4. 보험 계약");
		System.out.println("5. 사고 신고");
	}
}
