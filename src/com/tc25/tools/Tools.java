package com.tc25.tools;

import java.util.Scanner;

public class Tools {
	private static Tools instance;
	private Tools() {}	
	public static Tools getInstance() {
		if (instance == null) {
			instance = new Tools();
		}
		return instance;
	}

	
	public int getInt() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		int num = 0;
		while (b){	
			try {
				while (true) {
					System.out.println("请输入数字:");	
					num = sc.nextInt();	
					break;
				}
				b = false;				
			}catch (Exception e) {
				System.out.println("输入错误,请重新输入");
				sc.next();
			}
		}			
		return 0;
	}
	public byte getByte() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		byte num = 0;
		while (b){	
			try {
				while (true) {
					System.out.println("请输入数字:");	
					num =(byte)sc.nextInt();			
					if (num<-128 || num>127) {					
						System.out.println("数字输入错误,请重新输入");
						continue;				
					}	
					break;
				}
				b = false;				
			}catch (Exception e) {
				System.out.println("输入错误,请重新输入");
				sc.next();
			}
		}			
		return 0;
	}
	public short getShort() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		short s = 0;
		while (b){	
			try {
				while (true) {
					System.out.println("请输入数字:");	
					s =(short) sc.nextInt();	
					break;
				}
				b = false;				
			}catch (Exception e) {
				System.out.println("输入错误,请重新输入");
				sc.next();
			}
		}			
		return 0;
	}
	public char getChar() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		char c = '0';
		while (b){	
			try {
				while (true) {
					System.out.println("请输入字符:");	
					c =sc.next().charAt(0);	
					break;
				}
				b = false;				
			}catch (Exception e) {
				System.out.println("输入错误,请重新输入");
				sc.next();
			}
		}			
		return 0;
	}
	public long getLong(){
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		long l = 0;
		while (b){	
			try {
				while (true) {
					System.out.println("请输入数字:");	
					l =sc.nextInt();	
					break;
				}
				b = false;				
			}catch (Exception e) {
				System.out.println("输入错误,请重新输入");
				sc.next();
			}
		}			
		return 0;
	}
	public float getFloat() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		float f = 0.0F;
		while (b){	
			try {
				while (true) {
					System.out.println("请输入数字:");	
					f =sc.nextInt();	
					break;
				}
				b = false;				
			}catch (Exception e) {
				System.out.println("输入错误,请重新输入");
				sc.next();
			}
		}			
		return 0;
	}
	public double getDouble() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		double d = 0.0;
		while (b){	
			try {
				while (true) {
					System.out.println("请输入数字:");	
					d =sc.nextInt();	
					break;
				}
				b = false;				
			}catch (Exception e) {
				System.out.println("输入错误,请重新输入");
				sc.next();
			}
		}			
		return 0;
	}
	public boolean getBoolean() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean b = true;
		while (b){	
			try {
				while (true) {
					System.out.println("请输入数字:1为true,2为false");	
					num =sc.nextInt();	
					break;
				}
				b = false;				
			}catch (Exception e) {
				System.out.println("输入错误,请重新输入");
				sc.next();
			}
		}			
		return b;
	}
	
	
	

}
