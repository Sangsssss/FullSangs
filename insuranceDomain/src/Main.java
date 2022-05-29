import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Contract.ContractList;
import Contract.ContractListImpl;
import Employee.EmployeeList;
import Employee.EmployeeListImpl;
import Insurance.InsuranceList;
import Insurance.InsuranceListImpl;
import User.User;
import User.UserList;
import User.UserListImpl;

public class Main {
	static InsuranceList insurance = new InsuranceListImpl();
	static EmployeeList employee = new EmployeeListImpl();
	static ContractList contract = new ContractListImpl();
	static UserList user = new UserListImpl();
	public static void main(String[] args) throws IOException {
		BufferedReader objReader = new BufferedReader(new InputStreamReader(System.in));
		String currentUser = "123";
		while(true) {
		printWindow();
		String sChoice = objReader.readLine().trim();
		switch(sChoice) {
		case "1" : 
			WriteDocument(objReader);
			break;
	//-----------------------------------------------------------------------------------------------	
		case "3" : 
			developIn(objReader);
		    break;
		    
		    
		case "6" : System.out.println("가입설계서를 확인하시겠습니까?");
				   System.out.println("1. 예 2. 아니오");
				   if(objReader.readLine().trim().contains("1")) {
					   System.out.println(contract.getSuggestion(currentUser)); 
				   }
				   else {
					   break;
				   }
				   System.out.println("이어서 청약서를 확인하시겠습니까?");
				   System.out.println("1. 예 2. 아니오");
				   if(objReader.readLine().trim().contains("1")) {
					   System.out.println(contract.getSubscription(currentUser)); 
					   switch(contract.getSubscription(currentUser).getIType()) {
						case "화재" : System.out.println("건물 개수를 입력하세요");
						int value1 = Integer.parseInt(objReader.readLine().trim());
						System.out.println("건물 가격을 입력하세요");
						int value2 = Integer.parseInt(objReader.readLine().trim());
						System.out.println("월납입료는 "+contract.getSubscription(currentUser).getFee()*insurance.findFireRate(value1, value2) +" 입니다.");
					   	
						break;
					   	
							
						default :
					    	System.out.println("*******존재하지 않는 항목입니다.*******");
					   }
					   System.out.println("*******가입신청 하시겠습니까??*******");
					   System.out.println("*********1.예 | 2.아니오*********");
					   if(objReader.readLine().trim().contains("1")) {
						   //Contract c = new Contract();
					   }
						   
				   }
				   else {
					   break;
				   }
	    break;
		    default :
		    	System.out.println("*******존재하지 않는 항목입니다.*******");
	//----------------------------------------------------------------------------------------------	    	
		    	
			}
		}
	}
	private static void WriteDocument(BufferedReader objReader) throws IOException {
		ArrayList<User> a = user.findUserList();
		String list = "";
		for(int i=0; i<a.size(); i++) {
		list += a.get(i).toString() + "\n";
		}
		System.out.println(list);	
		System.out.println("*******고객을 선택해주세요.*******");
		String uchoice = objReader.readLine().trim();
		String userData = user.getUserData(uchoice);
		String userIdx = user.getUserIdx(uchoice);
		System.out.println(userData);
		//버튼 클릭시?
		System.out.println("계약을 계속 진행하시겠습니까?");
		System.out.println("1. 예");
		System.out.println("2. 아니오");
		if(objReader.readLine().equals("1")) {
			System.out.println("보험 상품 선택 후, 가입 설계서를 작성해주세요.");	
			for(int i = 0; i<insurance.getArrayCount(); i++) {
				System.out.println((i+1) + " " + insurance.getIName(i));
			}
			String iChoice = objReader.readLine().trim();
			switch(iChoice) {
			case "1" : 
				employee.writeSuggestion(0, userIdx);
			//전송 버튼 클릭시
			System.out.println("가입 설계서 전송하기 YES/NO");	
			if(objReader.readLine().equals("YES")) {
				contract.addSuggestion(0);
				System.out.println("전송이 완료되었습니다.");	
				System.out.println("---------------------------------");	
				System.out.println("청약서를 작성해주세요.");
			} else break;
				employee.writeSubscription(0, userIdx);
				System.out.println("청약서 전송하기 YES/NO");	
				if(objReader.readLine().equals("YES")) {
					contract.addSubscription(0);
					System.out.println("전송이 완료되었습니다.");	
					System.out.println("---------------------------------");	
				} else break;
				break;
			case "2" :
				break;
		}
		} else {
			System.out.println("계약 진행을 중단합니다");
		}
	}
	private static void developIn(BufferedReader objReader) throws IOException {
				   System.out.println("개발하실 보험을 입력해주세요");
				   System.out.println("화재보험개발,실손의료비보험개발,자동차보험개발,여행보험개발");		
				   System.out.println("3-1. 화재보험개발");
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
				   System.out.println("기간 : "); String period = objReader.readLine().trim();
				   System.out.println("보험료 : "); String fee = objReader.readLine().trim();
				   System.out.println("최대보장금액 : "); String maxReward = objReader.readLine().trim();
				   System.out.println("보장내용 : "); String content = objReader.readLine().trim();
				  
				   insurance.idevelop(iType,iName, period, fee, maxReward, content);
	}
	private static void printWindow() {
		System.out.println("1. 문서작성");
		System.out.println("2. 로그인"); //후순위
		System.out.println("3. 보험개발"); //
		System.out.println("4. 보험 계약");
		System.out.println("5. 사고 신고");
		System.out.println("6. 보험 가입");
	}
}
