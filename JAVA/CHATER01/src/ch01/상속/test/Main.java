package ch01.���.test;

import ch01.���.���ֵ�.��Ż;
import ch01.���.���ֵ�.������ũ;
import ch01.���.���ֵ�.���۸�;
import ch01.���.�������̽�.����;

public class Main {
	public static void main(String[] args) {
		���� ��Ż1 = new ��Ż();
		���� ��Ż2 = new ��Ż();
		���� ��Ż3 = new ��Ż();
		���� ��Ż4 = new ��Ż();
		������ũ ������ũ1 = new ������ũ();
		���� ���۸�1 = new ���۸�();
		
		System.out.println("��Ż2");
		��Ż2.run();
		System.out.println("��Ż1");
		��Ż1.run();
		line();
		System.out.println("������ũ");
		������ũ1.run();
		System.out.println("�����带 �մϴ�.");
		������ũ1.setmode();
		������ũ1.run();
		line();
		���۸�1.run();
	}
	public static void line() {
		System.out.println("=============================================");
	}
}
