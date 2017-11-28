package com.tc25.bizImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.tc25.bean.User;
import com.tc25.biz.Login;
import com.tc25.biz.Regist;
import com.tc25.data.UserList;
import com.tc25.tools.InputTools;

public class Register implements Regist{
	
	//��data����ȡ��Ҫʹ�õ����ݰ����û��б���˺������HashMap
	private UserList uL = UserList.getInstance();
	private ArrayList<User> userList = uL.getUserList();
	private HashMap<String,String> accMap = uL.getAccMap();
		
	//�������빤��
	private InputTools iT = InputTools.getInstance();
	/* 
	 * <p>Description: ʵ��ע�᷽��,�ֲ�����ñ��������������ע��,����û���Ϣ����data</p>    
	 */
	@Override
	public void regist() {
		String acc = registAcc();
		String pwd = registPwd();
		System.out.println("�Ƿ�Ҫ����������ʾ?(1Ϊ��,����Ϊ��)");
		String isNeedTip = iT.getString();
		String tip = "";
		if("1".equals(isNeedTip)) {
			tip = registTip();
		}
		System.out.println("�Ƿ�Ҫ�����û��ǳ�?(1Ϊ��,����Ϊ��,Ĭ��Ϊ�˻���)");
		String isNeedNick = iT.getString();
		String nick = "";
		if("1".equals(isNeedNick)) {
			nick = registNick();
		}else {
			nick = acc;
		}
		System.out.println("��ȷ�������û���Ϣ");
		System.out.println("�˺�:"+acc+"\t����:"+pwd+"\t������ʾ:"+tip+"\t�û��ǳ�:"+nick);
		System.out.println("����1ȷ��ע��\t����Ϊȡ��ע��:");
		String confirmReg = iT.getString();
		//�û�ȷ��ע��,��User���캯�������ö���,����������֮ǰ������ȡ
		//�����ö�������û�����,���˻������ֵ�Լ���HashMap
		if("1".equals(confirmReg)) {
			System.out.println("ע��ɹ�!");
			userList.add(new User());
			accMap.put(acc, pwd);
		}
	}
	/**
	 * 
	 * @Title: registNick  
	 * @Description: ע������е��û��ǳƲ���    
	 * @return String    �û��ǳ�  
	 */
	private String registNick() {
		System.out.println("�������ǳ�:");
		String nick = "";
		
		while(true) {
			nick = iT.getString();
			
			if(nick.length()>=3 && nick.length()<=16) {
				System.out.println("���óɹ�!");
				break;
			}else{
				System.out.println("�ǳƸ�ʽ����ȷ,����������:");
				continue;
			}
		}
		return nick;
	}

	/**
	 * 
	 * @Title: registTip  
	 * @Description: ע������е�������ʾ����  
	 * @return String    ������ʾ  
	 */
	private String registTip() {
		System.out.println("������������ʾ:");
		String tip = "";
		
		while(true) {
			tip = iT.getString();
			
			if(tip.length()<=16) {
				System.out.println("���óɹ�!");
				break;
			}else{
				System.out.println("������ʾ��ʽ����ȷ,����������:");
				continue;
			}
		}
		return tip;
	}

	/**
	 * 
	 * @Title: registAcc  
	 * @Description: ע������е��˻�������  
	 * @return String    �˻���  
	 */
	private String registAcc() {
		System.out.println("������Ҫ�������˻���:");
		String acc = "";
		//��ʦд��������ʽ,�����ַ����ĸ�ʽҪ��
		Pattern p = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z0-9_.]{5,15}");
		Matcher m = null;
		
		while(true) {
			//�������빤�ߵ�getString����,���û������˻���
			acc = iT.getString();
			//��m��ؾ����ж��ǲ��Ƿ���֮ǰ��������ʽ
			m = p.matcher(acc);
			//����������ʽҲ���Ǹ�ʽ��ȷ,�������˻���HashMap�в����ڴ��˻�
			//�������˻�����ע��,��Ȼ�����whileѭ���������û�����
			if(m.matches() && !(accMap.containsKey(acc))) {
				break;
			}else if(!m.matches()) {
				System.out.println("�˻�����ʽ����ȷ,����������:");
				continue;
			}else if(accMap.containsKey(acc)) {
				System.out.println("�˻����Ѵ���,����������:");
				continue;
			}
		}
		return acc;
	}
	
	/**
	 * 
	 * @Title: registPwd  
	 * @Description: ע������е����벿��  
	 * @return String    ����  
	 */
	private String registPwd() {
		System.out.println("����������:");
		String pwd ="";
		String pwd2 = "";
		Pattern p = Pattern.compile("[a-zA-Z0-9_.*]{6,16}");
		Matcher m = null;
		//���ϸ�����һ��,ֻ�ǲ����ж��Ƿ��Ѵ��ڸ�����
		while(true) {
			pwd = iT.getString();
			m = p.matcher(pwd);
			if(m.matches()) {
				
			}else{
				System.out.println("�����ʽ����ȷ,����������:");
				continue;
			}
			System.out.println("��ȷ������:");
			pwd2 = iT.getString();
			if(pwd.equals(pwd2)) {
				break;
			}else {
				System.out.println("ǰ�����벻һ��,��������������:");
				continue;
			}	
		}	
		return pwd;
	}

}
