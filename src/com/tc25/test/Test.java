package com.tc25.test;

import com.tc25.bizImpl.Loginer;
import com.tc25.bizImpl.Register;

public class Test {
	public static void main(String[] args) {
		
		Register r = new Register();
		r.regist();
		Loginer l = new Loginer();
		l.login();		
		
	}
}