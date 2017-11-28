/**
 * 
 */
package com.tc25.view;

import java.util.Scanner;

/**
 * @ClassName  : mainView.java
 * @Package    : com.tc25.view
 * @Description: DVD����ϵͳ������
 *
 * @author Administrator
 * @date 2017��11��20������7:33:25
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
	 * ��ʾ��ӭ����.
	* @Title: showWelcome 
	* @Description:DVD����ϵͳ������ 
	* @param   ����˵�� 
	* @return void    �������� 
	* @throws
	 */
	public void showWelcome() {
		for (int i = 0; i < 100; i++) {
			System.out.print("*");
			if (i == 49) {
				System.out.println("\n");
				System.out.println("\t\t��ӭ����DVD����ϵͳ");
				System.out.println("\n");
			}
		}
	}
	public void showMenu() {
		System.out.println("1.�û���¼");
		System.out.println("2.�û�ע��");
		System.out.println("3.����Աע��");
		System.out.println("4.�˳�");
		
		Scanner sc =new Scanner(System.in);
		int choose=0;
		choose =sc.nextInt();
		switch (choose) {		
		case 1:			
			System.out.println("�û���¼����");
			break;
		case 2:
			System.out.println("�û�ע�����");
			break;
		case 3:
			System.out.println("����Ա��¼����");
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
			System.out.println("��������Ҫע����˺�");
			break;
		case 2:
			System.out.println("��������Ҫע����ǳ�");
			break;
		case 3:
			System.out.println("�������˻�����");
			break;
		case 4:
			System.out.println("������������ʾ");
			break;
		case 5:
			System.out.println("��������,����������");
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
			System.out.println("�����������˺�");
			break;
		case 2:
			System.out.println("�������˻�����");
			break;
		case 3:
			System.out.println("������������ʾ");
			break;
		case 4:
			System.out.println("��������,����������");
			break;			
		case 5:
			System.exit(0);
			break;
		default:
			break;
		}
	}
}
