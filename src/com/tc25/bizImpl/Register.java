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
	
	//从data包获取需要使用的数据包括用户列表和账号密码的HashMap
	private UserList uL = UserList.getInstance();
	private ArrayList<User> userList = uL.getUserList();
	private HashMap<String,String> accMap = uL.getAccMap();
		
	//调用输入工具
	private InputTools iT = InputTools.getInstance();
	/* 
	 * <p>Description: 实现注册方法,分步骤调用本类其他方法完成注册,最后将用户信息放入data</p>    
	 */
	@Override
	public void regist() {
		String acc = registAcc();
		String pwd = registPwd();
		System.out.println("是否要设置密码提示?(1为是,其它为否)");
		String isNeedTip = iT.getString();
		String tip = "";
		if("1".equals(isNeedTip)) {
			tip = registTip();
		}
		System.out.println("是否要设置用户昵称?(1为是,其它为否,默认为账户名)");
		String isNeedNick = iT.getString();
		String nick = "";
		if("1".equals(isNeedNick)) {
			nick = registNick();
		}else {
			nick = acc;
		}
		System.out.println("请确认您的用户信息");
		System.out.println("账号:"+acc+"\t密码:"+pwd+"\t密码提示:"+tip+"\t用户昵称:"+nick);
		System.out.println("输入1确认注册\t其他为取消注册:");
		String confirmReg = iT.getString();
		//用户确认注册,用User构造函数创建该对象,各参数已于之前方法获取
		//并将该对象放入用户集合,将账户密码键值对加入HashMap
		if("1".equals(confirmReg)) {
			System.out.println("注册成功!");
			userList.add(new User());
			accMap.put(acc, pwd);
		}
	}
	/**
	 * 
	 * @Title: registNick  
	 * @Description: 注册过程中的用户昵称部分    
	 * @return String    用户昵称  
	 */
	private String registNick() {
		System.out.println("请输入昵称:");
		String nick = "";
		
		while(true) {
			nick = iT.getString();
			
			if(nick.length()>=3 && nick.length()<=16) {
				System.out.println("设置成功!");
				break;
			}else{
				System.out.println("昵称格式不正确,请重新输入:");
				continue;
			}
		}
		return nick;
	}

	/**
	 * 
	 * @Title: registTip  
	 * @Description: 注册过程中的密码提示部分  
	 * @return String    密码提示  
	 */
	private String registTip() {
		System.out.println("请输入密码提示:");
		String tip = "";
		
		while(true) {
			tip = iT.getString();
			
			if(tip.length()<=16) {
				System.out.println("设置成功!");
				break;
			}else{
				System.out.println("密码提示格式不正确,请重新输入:");
				continue;
			}
		}
		return tip;
	}

	/**
	 * 
	 * @Title: registAcc  
	 * @Description: 注册过程中的账户名部分  
	 * @return String    账户名  
	 */
	private String registAcc() {
		System.out.println("请输入要创建的账户名:");
		String acc = "";
		//老师写的正则表达式,给出字符串的格式要求
		Pattern p = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z0-9_.]{5,15}");
		Matcher m = null;
		
		while(true) {
			//调用输入工具的getString方法,让用户输入账户名
			acc = iT.getString();
			//和m相关就是判断是不是符合之前的正则表达式
			m = p.matcher(acc);
			//符合正则表达式也就是格式正确,并且在账户名HashMap中不存在此账户
			//则代表此账户可以注册,不然会继续while循环重新让用户输入
			if(m.matches() && !(accMap.containsKey(acc))) {
				break;
			}else if(!m.matches()) {
				System.out.println("账户名格式不正确,请重新输入:");
				continue;
			}else if(accMap.containsKey(acc)) {
				System.out.println("账户名已存在,请重新输入:");
				continue;
			}
		}
		return acc;
	}
	
	/**
	 * 
	 * @Title: registPwd  
	 * @Description: 注册过程中的密码部分  
	 * @return String    密码  
	 */
	private String registPwd() {
		System.out.println("请输入密码:");
		String pwd ="";
		String pwd2 = "";
		Pattern p = Pattern.compile("[a-zA-Z0-9_.*]{6,16}");
		Matcher m = null;
		//和上个方法一样,只是不用判断是否已存在该密码
		while(true) {
			pwd = iT.getString();
			m = p.matcher(pwd);
			if(m.matches()) {
				
			}else{
				System.out.println("密码格式不正确,请重新输入:");
				continue;
			}
			System.out.println("请确认密码:");
			pwd2 = iT.getString();
			if(pwd.equals(pwd2)) {
				break;
			}else {
				System.out.println("前后输入不一致,请重新设置密码:");
				continue;
			}	
		}	
		return pwd;
	}

}
