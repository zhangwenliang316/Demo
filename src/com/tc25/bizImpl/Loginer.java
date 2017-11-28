package com.tc25.bizImpl;

import java.util.ArrayList;
import java.util.HashMap;

import com.tc25.bean.User;
import com.tc25.biz.Login;
import com.tc25.data.UserList;
import com.tc25.tools.InputTools;

public class Loginer implements Login{
	//��data����ȡ��Ҫʹ�õ����ݰ����û��б���˺������HashMap
	private UserList uL = UserList.getInstance();
	private ArrayList<User> userList = uL.getUserList();
	private HashMap<String,String> accMap = uL.getAccMap();
		
		//�������빤��
	private InputTools iT = InputTools.getInstance();
	@Override
	public User login() {
		System.out.println("�������˻���:");
		String acc = "";
		while(true) {
			acc = iT.getString();
			//�ж��Ƿ���ڸ��˺�
			if(accMap.containsKey(acc)) {
				break;
			}else {
				System.out.println("���˻���������,����������:");
				continue;
			}
		}
		
		
		System.out.println("����������:");
		String pwd = "";
		//���ڼ�¼��������Ĵ���
		int count = 1;
		//��ѭ��
		while(count <= 5) {
			pwd = iT.getString();
			//С��3�λ�ѯ���Ƿ�Ҫ������ʾ
			if( count < 3) {				
				if(pwd.equals(accMap.get(acc))) {
					System.out.println("��¼�ɹ�!");
					//�ɹ��͵���������һ���������˻���Ӧ��User���󷵻�,�Ա�������
					return currentUser(acc);
				}
				System.out.println("�������!����������(ʣ��"+(5-count++)+"�λ���):");
				System.out.println("�Ƿ���������ʾ?(1Ϊ��,����Ϊ��)");
				String isNeedTip = iT.getString();
				if("1".equals(isNeedTip)) {
					showTip(acc);
					System.out.println("����������:");
					continue;
				}				
			}else {
				//���ﲻ��ѯ���Ƿ�Ҫ������ʾ,ֱ�Ӹ�����ʾ
				if(pwd.equals(accMap.get(acc))) {
					System.out.println("��¼�ɹ�!");
					return currentUser(acc);
				}
				if(count < 5) {
					System.out.println("�������!����������(ʣ��"+(5-count++)+"�λ���):");
					showTip(acc);
					System.out.println("����������:");
				}else {
					//���5�λ�д�δ��������˻�,�Ҳ���д
					System.out.println("��������Ѵ�5��,���˻��ѱ�����24Сʱ!");
					count++;
				}
			}		
		}
		//û�е�¼�ɹ��᷵��null,����Ϳ����жϵõ�null��ʾ��¼ʧ��
		return null;
		
		
	}
	
	/**
	 * 
	 * @Title: showTip  
	 * @Description: ���û���Ҫ������ʾ,�����û��б�ͨ���˻����ҵ���Ӧ�û�
	 * ��ͨ���û�����������ʾ  
	 * @param @param acc    ����  
	 * @return void    ��������  
	 * @throws
	 */
	private void showTip(String acc) {
		for (User user : userList) {
			if(user.getUserAccount().equals(acc)) {
				System.out.println("������ʾΪ:"+user.getUserPwdTip());
				break;
			}
		}
	}
	
	/**
	 * 
	 * @Title: currentUser  
	 * @Description: ��¼�ɹ� �����û��б�ͨ���˻��ҵ��û�  
	 * @param acc    �˻���  
	 * @return User   �û����� 
	 */
	private User currentUser(String acc) {
		for (User user : userList) {
			if(user.getUserAccount().equals(acc)) {
				
				return user;
			}
		}
		return null;
	}

}
