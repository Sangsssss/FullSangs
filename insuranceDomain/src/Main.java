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
			System.out.println("*******���� �������ּ���.*******");
			String uchoice = objReader.readLine().trim();
			System.out.println(user.getUserData(uchoice));
			//��ư Ŭ����?
			System.out.println("����� ��� �����Ͻðڽ��ϱ�?");
			System.out.println("1. ��");
			System.out.println("2. �ƴϿ�");
			switch(objReader.readLine().trim()) {
			case "1": 
			System.out.println("���� ��ǰ�� �������ּ���.");
			
			//
//			for(int i = 0; i<list.length(); i++) {
//				System.out.println((i+1) + list.get(i).getIName());
//			}
			System.out.println("1. �ǰ�����");
			System.out.println("2. �ڵ�������");
			String iChoice = objReader.readLine().trim();
			switch(iChoice) {
			case "1" : System.out.println("--------------���Լ��輭--------------");	   
			System.out.println(insurance.getInsurance(0));
			System.out.println("-----------------------------------");	
			//���� ��ư Ŭ����
			System.out.println("�����ϱ� YES/NO");	
			if(objReader.readLine().equals("YES")) {
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");	
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
		    	System.out.println("*******�������� �ʴ� �׸��Դϴ�.*******");
	//----------------------------------------------------------------------------------------------	    	
		    	
			}
		}
	}
	private static void developIn(BufferedReader objReader) throws IOException {
		System.out.println("�����Ͻ� ������ �Է����ּ���");
				   System.out.println("ȭ�纸�谳��,�Ǽ��Ƿ���谳��,�ڵ������谳��,���ຸ�谳��");		
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
				   System.out.println("���峻�� : "); String content = objReader.readLine().trim();
				   System.out.println("�Ⱓ : "); String period = objReader.readLine().trim();
				   System.out.println("����� : "); String fee = objReader.readLine().trim();
				   System.out.println("�ִ뺸��ݾ� : "); String maxReward = objReader.readLine().trim();
				  
				   insurance.idevelop(iType,iName, content, period, fee, maxReward);
	}
	private static void printWindow() {
		System.out.println("1. ���");
		System.out.println("2. �α���"); //�ļ���
		System.out.println("3. ���谳��"); //
		System.out.println("4. ���� ���");
		System.out.println("5. ��� �Ű�");
	}
}
