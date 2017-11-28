/**
 * 
 */
package com.tc25.view;

import java.util.Scanner;

/**
 * @ClassName  : mainView.java
 * @Package    : com.tc25.view
 * @Description: DVD管理系统主界面
 *
 * @author Administrator
 * @date 2017年11月20日下午7:33:25
 * @version 1.0
 */

public class mainView extends View{

	
	@Override
	public View showView() {
		showWelcome();
		showMenu();
		userRegisterMenu();
		userLoginMenu();
		return null;
	}
	/**
	 * 显示欢迎界面.
	* @Title: showWelcome 
	* @Description:DVD管理系统主界面 
	* @param   参数说明 
	* @return void    返回类型 
	* @throws
	 */
	public void showWelcome() {
		for (int i = 0; i < 100; i++) {
			System.out.print("*");
			if (i == 49) {
				System.out.println("\n");
				System.out.println("\t\t欢迎来到DVD管理系统");
				System.out.println("\n");
			}
		}
	}
	public void showMenu() {
		System.out.println("1.用户登录");
		System.out.println("2.用户注册");
		System.out.println("3.管理员注册");
		System.out.println("4.退出");
		
		Scanner sc =new Scanner(System.in);
		int choose=0;
		choose =sc.nextInt();
		switch (choose) {		
		case 1:			
			System.out.println("用户登录界面");
			break;
		case 2:
			System.out.println("用户注册界面");
			break;
		case 3:
			System.out.println("管理员登录界面");
			break;	
		case 4:
			System.exit(0);
			break;
		default:
			break;
		}
	}
	public void userRegisterMenu(){
		Scanner sc =new Scanner(System.in);
		int choose=0;
		choose =sc.nextInt();
		switch (choose) {		
		case 1:			
			System.out.println("请输入您要注册的账号");
			break;
		case 2:
			System.out.println("请输入您要注册的昵称");
			break;
		case 3:
			System.out.println("请输入账户密码");
			break;
		case 4:
			System.out.println("请输入密码提示");
			break;
		case 5:
			System.out.println("输入有误,请重新输入");
			break;				
		case 6:
			System.exit(0);
			break;
		default:
			break;
		}
	}
	public void userLoginMenu(){
		Scanner sc =new Scanner(System.in);
		int choose=0;
		choose =sc.nextInt();
		switch (choose) {		
		case 1:			
			System.out.println("请输入您的账号");
			break;
		case 2:
			System.out.println("请输入账户密码");
			break;
		case 3:
			System.out.println("请输入密码提示");
			break;
		case 4:
			System.out.println("输入有误,请重新输入");
			break;			
		case 5:
			System.exit(0);
			break;
		default:
			break;
		}
	}
}
