/**
 * 
 */
package com.tc25.bizImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.tc25.bean.DVD;
import com.tc25.bean.User;
import com.tc25.biz.Manager;
import com.tc25.tools.InputTools;

/**
 * @ClassName  : ShiXian.java
 * @Package    : com.tc25.bizImpl
 * @Description: TODO
 *
 * @author Administrator
 * @date 2017��11��21������7:16:28
 * @version 1.0
 */

public class ShiXian implements Manager{
	private ArrayList<String> accountList = new ArrayList<>();
	private ArrayList<User> array = new ArrayList<>();
	/* 
	 * ��¼��Ϊ
	 */
	@Override
	public void login() {
		
		
	}

	/* 
	 * ע����Ϊ
	 */
	@Override
	public void register() {
		Pattern p = Pattern.compile("^[A-Z]{1}[a-zA-Z0-9_.]{1,16}");
		Matcher m = p.matcher("Ab.1231111#11111111");
		System.out.println(m.matches());
		ShiXian s =new ShiXian();
		s.registerAccount();
	}
	
	public void registerAccount(){
		System.out.println("��������Ҫע����˻�");
		String userAccount ="";
		InputTools it =new InputTools(); 
		
		
		
		
	}
	

}
