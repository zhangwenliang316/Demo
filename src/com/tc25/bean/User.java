/**
 * 
 */
package com.tc25.bean;

/**
 * @ClassName  : User.java
 * @Package    : com.tc25.bean
 * @Description: �û���
 *
 * @author Administrator
 * @date 2017��11��20������7:36:27
 * @version 1.0
 */

public class User {
	private String userAccount;//�û��˻�
	private String userName;//�û��ǳ�
	private int userId;//�û�Id
	private String userPwd;//�û�����
	private String userPwdTip;//�û�������ʾ
	private boolean userStatus;//�û�״̬:1Ϊ����2Ϊ������
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserPwdTip() {
		return userPwdTip;
	}
	public void setUserPwdTip(String userPwdTip) {
		this.userPwdTip = userPwdTip;
	}
	public boolean isUserStatus() {
		return userStatus;
	}
	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}
	//ȫ�ι���
	public User(String userAccount, String userName, int userId, String userPwd, String userPwdTip,
			boolean userStatus) {
		super();
		this.userAccount = userAccount;
		this.userName = userName;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userPwdTip = userPwdTip;
		this.userStatus = userStatus;
	}
	//ȱ���û�Id���вι���
	public User(String userAccount, String userName, String userPwd, String userPwdTip, boolean userStatus) {
		super();
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userPwdTip = userPwdTip;
		this.userStatus = userStatus;
	}
	//�޲ι���
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userAccount=" + userAccount + ", userName=" + userName + ", userId=" + userId + ", userPwd="
				+ userPwd + ", userPwdTip=" + userPwdTip + ", userStatus=" + userStatus + "]";
	}
	
	
	
	
}
