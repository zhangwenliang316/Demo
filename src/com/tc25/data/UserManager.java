/**
 * 
 */
package com.tc25.data;

import java.util.ArrayList;

import com.tc25.bean.User;

/**
 * @ClassName  : UserManager.java
 * @Package    : com.tc25.data
 * @Description: �û������
 *
 * @author Administrator
 * @date 2017��11��23������7:46:39
 * @version 1.0
 */

public class UserManager {
	private ArrayList<User> userList = new ArrayList<>();
	private ArrayList<Integer> idList = new ArrayList<>();
	private ArrayList<String> accList = new ArrayList<>();
	//�û�Id�Ĵ�������
	public int idCreate() {
		idList.add(idList.size()+1);
		return idList.size();
	}
	//����û��ķ���
	public boolean addUser(User user) {
		if(user == null) {
			return false;
		}
		userList.add(user);
		return true;
	}
	//�����û�Idɾ���û��ķ���
	public User subUserById(int id) {
		for (User user : userList) {
			if(user.getUserId() == id) {
				userList.remove(user);
				return user;
			}
		}
		return null;
	}
	//�����û��˻�ɾ���û��ķ���
	public User subUserByAcc(String acc) {
		for (User user : userList) {
			if(user.getUserAccount() == acc) {
				userList.remove(user);
				return user;
			}
		}
		return null;
	}
	//�����û�Id�޸ĵ��û���Ϣ�ķ���
	public void modifyUserByid(int id) {
		for(User user :userList) {
			if(user.getUserId()==id) {
				System.out.println("���ҵ�!/n"+user.toString());
				userList.set(id, new User());
				break;
			}else {
				;
			}
		}
	}
	//�����û��˺��޸ĵ��û���Ϣ�ķ���
	public void modifyUserByAcc(String acc) {
		for(User user :userList) {
			if(user.getUserAccount()==acc) {
				System.out.println("���ҵ�!/n"+user.toString());
				userList.set(user.getUserId(), new User());
				break;
			}else {
				;
			}
		}
	}
	//�����û�Id�����û��ķ���
	public User checkUserById(int id) {
		for (User user : userList) {
			if(user.getUserId() == id) {
				System.out.println(user.toString());
				return user;
			}
		}
		return null;
	}
	//�����û��˻������û��ķ���
	public User checkUserByAcc(String acc) {
		for (User user : userList) {
			if(user.getUserAccount() == acc) {
				System.out.println(user.toString());
				return user;
			}
		}
		return null;
	}
	//���������û��ķ���
	public void checkAllUser() {
		for (User user : userList) {			
			System.out.println(user.toString());						
		}
	}
	
}
