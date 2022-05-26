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
			System.out.println("*******���� �������ּ���.*******");
			String uchoice = objReader.readLine().trim();
			System.out.println(userList.getUserData(uchoice));
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
				   case "1" :  
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
			InsuranceList insuranceList = new InsuranceListImpl();
			insuranceList.idevelop(iType,iName, content, period, fee, maxReward);
	}
	private static void printWindow() {
		System.out.println("1. ���");
		System.out.println("2. �α���"); //�ļ���
		System.out.println("3. ���谳��"); //
		System.out.println("4. ���� ���");
		System.out.println("5. ��� �Ű�");
	}
}
