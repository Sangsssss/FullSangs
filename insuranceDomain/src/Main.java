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
		    
		    
		case "6" : System.out.println("���Լ��輭�� Ȯ���Ͻðڽ��ϱ�?");
				   System.out.println("1. �� 2. �ƴϿ�");
				   if(objReader.readLine().trim().contains("1")) {
					   System.out.println(contract.getSuggestion(currentUser)); 
				   }
				   else {
					   break;
				   }
				   System.out.println("�̾ û�༭�� Ȯ���Ͻðڽ��ϱ�?");
				   System.out.println("1. �� 2. �ƴϿ�");
				   if(objReader.readLine().trim().contains("1")) {
					   System.out.println(contract.getSubscription(currentUser)); 
					   switch(contract.getSubscription(currentUser).getIType()) {
						case "ȭ��" : System.out.println("�ǹ� ������ �Է��ϼ���");
						int value1 = Integer.parseInt(objReader.readLine().trim());
						System.out.println("�ǹ� ������ �Է��ϼ���");
						int value2 = Integer.parseInt(objReader.readLine().trim());
						System.out.println("�����Է�� "+contract.getSubscription(currentUser).getFee()*insurance.findFireRate(value1, value2) +" �Դϴ�.");
					   	
						break;
					   	
							
						default :
					    	System.out.println("*******�������� �ʴ� �׸��Դϴ�.*******");
					   }
					   System.out.println("*******���Խ�û �Ͻðڽ��ϱ�??*******");
					   System.out.println("*********1.�� | 2.�ƴϿ�*********");
					   if(objReader.readLine().trim().contains("1")) {
						   //Contract c = new Contract();
					   }
						   
				   }
				   else {
					   break;
				   }
	    break;
		    default :
		    	System.out.println("*******�������� �ʴ� �׸��Դϴ�.*******");
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
		System.out.println("*******���� �������ּ���.*******");
		String uchoice = objReader.readLine().trim();
		String userData = user.getUserData(uchoice);
		String userIdx = user.getUserIdx(uchoice);
		System.out.println(userData);
		//��ư Ŭ����?
		System.out.println("����� ��� �����Ͻðڽ��ϱ�?");
		System.out.println("1. ��");
		System.out.println("2. �ƴϿ�");
		if(objReader.readLine().equals("1")) {
			System.out.println("���� ��ǰ ���� ��, ���� ���輭�� �ۼ����ּ���.");	
			for(int i = 0; i<insurance.getArrayCount(); i++) {
				System.out.println((i+1) + " " + insurance.getIName(i));
			}
			String iChoice = objReader.readLine().trim();
			switch(iChoice) {
			case "1" : 
				employee.writeSuggestion(0, userIdx);
			//���� ��ư Ŭ����
			System.out.println("���� ���輭 �����ϱ� YES/NO");	
			if(objReader.readLine().equals("YES")) {
				contract.addSuggestion(0);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");	
				System.out.println("---------------------------------");	
				System.out.println("û�༭�� �ۼ����ּ���.");
			} else break;
				employee.writeSubscription(0, userIdx);
				System.out.println("û�༭ �����ϱ� YES/NO");	
				if(objReader.readLine().equals("YES")) {
					contract.addSubscription(0);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");	
					System.out.println("---------------------------------");	
				} else break;
				break;
			case "2" :
				break;
		}
		} else {
			System.out.println("��� ������ �ߴ��մϴ�");
		}
	}
	private static void developIn(BufferedReader objReader) throws IOException {
				   System.out.println("�����Ͻ� ������ �Է����ּ���");
				   System.out.println("ȭ�纸�谳��,�Ǽ��Ƿ���谳��,�ڵ������谳��,���ຸ�谳��");		
				   System.out.println("3-1. ȭ�纸�谳��");
				   System.out.println("3-2. �Ǽ��Ƿ���谳��");
				   System.out.println("3-3. �ڵ������谳��");
				   System.out.println("3-4. ���ຸ�谳��");
				   String iType = "";
				   String s2Choice = objReader.readLine().trim();
				   switch(s2Choice) {
				   case "1" :  System.out.println("ȭ�纸�谳��");	
					   	iType = "ȭ��";
				   break;
				   case "2" :  System.out.println("�Ǽ��Ƿ���谳��");	
				   		iType = "�Ǽ��Ƿ��";
				   break;
				   case "3" :  System.out.println("�ڵ������谳��");	
				   iType = "�ڵ���";
				   break;
				   case "4" :  System.out.println("���ຸ�谳��");	
				   iType = "����";
				   break;
				   default :
				    	System.out.println("*******�������� �ʴ� �׸��Դϴ�.*******");
				   }
				   System.out.println("---------������ ���� ������ �Է����ּ���---------");
				   System.out.println("����� : "); String iName = objReader.readLine().trim();
				   System.out.println("�Ⱓ : "); String period = objReader.readLine().trim();
				   System.out.println("����� : "); String fee = objReader.readLine().trim();
				   System.out.println("�ִ뺸��ݾ� : "); String maxReward = objReader.readLine().trim();
				   System.out.println("���峻�� : "); String content = objReader.readLine().trim();
				  
				   insurance.idevelop(iType,iName, period, fee, maxReward, content);
	}
	private static void printWindow() {
		System.out.println("1. �����ۼ�");
		System.out.println("2. �α���"); //�ļ���
		System.out.println("3. ���谳��"); //
		System.out.println("4. ���� ���");
		System.out.println("5. ��� �Ű�");
		System.out.println("6. ���� ����");
	}
}
