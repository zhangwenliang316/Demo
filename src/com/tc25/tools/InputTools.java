/**
 * 
 */
package com.tc25.tools;

import java.util.Scanner;

/**
 * @ClassName : InputTools.java
 * @Package : com.tc25.tools
 * @Description: TODO
 *
 * @author Administrator
 * @date 2017��11��21������7:51:08
 * @version 1.0
 */

public class InputTools {
	/*
	 * 1.�ṩ˽�еĹ��췽�� 2.�ṩ��̬��������ֵΪ��ǰ��.���� 3.�ṩ��̬��Ա����.�����ǵ�ǰ������.
	 * 4.�ڷ������ṩif�ж�.���ʵ��Ϊnull��new
	 */
	private static InputTools instance;

	public InputTools() {
	}

	public static InputTools getInstance() {
		if (instance == null) {
			instance = new InputTools();
		}
		return instance;
	}

	public int getInt() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		int num = 0;
		while (b) {
			try {
				while (true) {
					System.out.println("����������:");
					num = sc.nextInt();
					break;
				}
				b = false;
			} catch (Exception e) {
				System.out.println("�������,����������");
				sc.next();
			}
		}
		return 0;
	}

	public byte getByte() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		byte num = 0;
		while (b) {
			try {
				while (true) {
					System.out.println("����������:");
					num = (byte) sc.nextInt();
					if (num < -128 || num > 127) {
						System.out.println("�����������,����������");
						continue;
					}
					break;
				}
				b = false;
			} catch (Exception e) {
				System.out.println("�������,����������");
				sc.next();
			}
		}
		return 0;
	}

	public short getShort() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		short s = 0;
		while (b) {
			try {
				while (true) {
					System.out.println("����������:");
					s = (short) sc.nextInt();
					break;
				}
				b = false;
			} catch (Exception e) {
				System.out.println("�������,����������");
				sc.next();
			}
		}
		return 0;
	}

	public char getChar() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		char c = '0';
		while (b) {
			try {
				while (true) {
					System.out.println("�������ַ�:");
					c = sc.next().charAt(0);
					break;
				}
				b = false;
			} catch (Exception e) {
				System.out.println("�������,����������");
				sc.next();
			}
		}
		return 0;
	}

	public long getLong() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		long l = 0;
		while (b) {
			try {
				while (true) {
					System.out.println("����������:");
					l = sc.nextInt();
					break;
				}
				b = false;
			} catch (Exception e) {
				System.out.println("�������,����������");
				sc.next();
			}
		}
		return 0;
	}

	public float getFloat() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		float f = 0.0F;
		while (b) {
			try {
				while (true) {
					System.out.println("����������:");
					f = sc.nextInt();
					break;
				}
				b = false;
			} catch (Exception e) {
				System.out.println("�������,����������");
				sc.next();
			}
		}
		return 0;
	}

	public double getDouble() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		double d = 0.0;
		while (b) {
			try {
				while (true) {
					System.out.println("����������:");
					d = sc.nextInt();
					break;
				}
				b = false;
			} catch (Exception e) {
				System.out.println("�������,����������");
				sc.next();
			}
		}
		return 0;
	}

	public boolean getBoolean() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean b = true;
		while (b) {
			try {
				while (true) {
					System.out.println("����������:1Ϊtrue,2Ϊfalse");
					num = sc.nextInt();
					break;
				}
				b = false;
			} catch (Exception e) {
				System.out.println("�������,����������");
				sc.next();
			}
		}
		return b;
	}
	public String getString() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		String str = "";
		while (b) {
			try {
				while (true) {
					System.out.println("�������ַ�:");
					str = sc.next();
					break;
				}
				b = false;
			} catch (Exception e) {
				System.out.println("�������,����������");
				sc.next();
			}
		}
		return str;
	}
}
