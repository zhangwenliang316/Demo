/**
 * 
 */
package com.tc25.data;

import java.util.ArrayList;

import com.tc25.bean.User;

/**
 * @ClassName  : UserManager.java
 * @Package    : com.tc25.data
 * @Description: 用户类管理
 *
 * @author Administrator
 * @date 2017年11月23日下午7:46:39
 * @version 1.0
 */

public class UserManager {
	private ArrayList<User> userList = new ArrayList<>();
	private ArrayList<Integer> idList = new ArrayList<>();
	private ArrayList<String> accList = new ArrayList<>();
	//用户Id的创建方法
	public int idCreate() {
		idList.add(idList.size()+1);
		return idList.size();
	}
	//添加用户的方法
	public boolean addUser(User user) {
		if(user == null) {
			return false;
		}
		userList.add(user);
		return true;
	}
	//根据用户Id删除用户的方法
	public User subUserById(int id) {
		for (User user : userList) {
			if(user.getUserId() == id) {
				userList.remove(user);
				return user;
			}
		}
		return null;
	}
	//根据用户账户删除用户的方法
	public User subUserByAcc(String acc) {
		for (User user : userList) {
			if(user.getUserAccount() == acc) {
				userList.remove(user);
				return user;
			}
		}
		return null;
	}
	//根据用户Id修改的用户信息的方法
	public void modifyUserByid(int id) {
		for(User user :userList) {
			if(user.getUserId()==id) {
				System.out.println("已找到!/n"+user.toString());
				userList.set(id, new User());
				break;
			}else {
				;
			}
		}
	}
	//根据用户账号修改的用户信息的方法
	public void modifyUserByAcc(String acc) {
		for(User user :userList) {
			if(user.getUserAccount()==acc) {
				System.out.println("已找到!/n"+user.toString());
				userList.set(user.getUserId(), new User());
				break;
			}else {
				;
			}
		}
	}
	//根据用户Id查找用户的方法
	public User checkUserById(int id) {
		for (User user : userList) {
			if(user.getUserId() == id) {
				System.out.println(user.toString());
				return user;
			}
		}
		return null;
	}
	//根据用户账户查找用户的方法
	public User checkUserByAcc(String acc) {
		for (User user : userList) {
			if(user.getUserAccount() == acc) {
				System.out.println(user.toString());
				return user;
			}
		}
		return null;
	}
	//查找所有用户的方法
	public void checkAllUser() {
		for (User user : userList) {			
			System.out.println(user.toString());						
		}
	}
	
}
