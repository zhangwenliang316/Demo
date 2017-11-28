/**
 * 
 */
package com.tc25.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import com.tc25.bean.User;

/**
 * @ClassName  : UserList.java
 * @Package    : com.tc25.data
 * @Description: TODO
 *
 * @author Administrator
 * @date 2017��11��20������8:05:17
 * @version 1.0
 */

public class UserList {
	
	private static UserList instance;
	private  ArrayList<User> userList = new ArrayList<>();
	private  HashMap<String,String> accMap = new HashMap<>();
	private  ArrayList<Integer> idList = new ArrayList<>();
	
	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public ArrayList<Integer> getIdList() {
		return idList;
	}

	public void setIdList(ArrayList<Integer> idList) {
		this.idList = idList;
	}
	
	private UserList() {
		init();
	}
	
	public static UserList getInstance() {
		if(instance == null) {
			instance = new UserList();
		}
		return instance;
	}
	//UserId�Ĵ�������
	public int idCreate() {
		idList.add(idList.size()+1);
		return idList.size();
	}
	
	
	public HashMap<String,String> getAccMap() {
		return accMap;
	}

	public void addToAccMap(String userAcc,String userPwd) {
		accMap.put(userAcc,userPwd);
	}

	//User���ϳ�ʼ������ֵ���Լ��Ͻ��б���	
	public void init(){
		User u1  = new User("","����","","",true);
		User u2  = new User("","����","","",true);
		User u3  = new User("","����","","",true);
		User u4  = new User("","����","","",true);
		User u5  = new User("","Ǯ��","","",true);
		User u6  = new User("","���","","",true);
		User u7  = new User("","�ܾ�","","",true);
		User u8  = new User("","��ʮ","","",true);
		User u9  = new User("","֣��","","",true);
		User u10 = new User("","��һ","","",true);
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		userList.add(u6);
		userList.add(u7);
		userList.add(u8);
		userList.add(u9);
		userList.add(u10);		
		for(int i =0;i<userList.size();i++){
			userList.get(i).setUserId(i+1);
		}
		
		accMap.put("AA1234","123456");
		accMap.put("BB1234","123456");
		accMap.put("CC1234","123456");
		accMap.put("DD1234","123456");
		accMap.put("EE1234","123456");
		accMap.put("FF1234","123456");
		accMap.put("GG1234","123456");
		accMap.put("HH1234","123456");
		accMap.put("II1234","123456");
		accMap.put("JJ1234","123456");
		
	}	
}
