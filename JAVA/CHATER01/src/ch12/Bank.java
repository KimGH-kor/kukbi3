package ch12;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		int num;//���ѹ�
		String name;//���̸�
		long fund;//������ ��
		double hope;//������ͷ�
		double add;//�����ͷ�
		double susu = 0;//��������
		int sun;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ��ȣ");
		num = sc.nextInt();
		System.out.println("����");
		name = sc.next();
		System.out.println("FUND�ݾ�");
		fund = sc.nextInt();
		System.out.println("��� ���ͷ�");
		hope = sc.nextDouble();
		System.out.println("��������");
		susu = sc.nextDouble();
		System.out.println("�����ͷ�");
		add = sc.nextDouble();
		
		if(Math.round((hope-susu)*100)/100.0==add) {
			System.out.println("����ȣ : "+ num);
			System.out.println("���̸� : "+ name);
			System.out.println("FUND�ݾ� : "+fund);
			System.out.println("��� ���ͷ� : "+hope);
			System.out.println("�������� : "+susu);
			System.out.println("�����ͷ� : "+add);	
		}
//		double ps = (((hope-susu)*fund/100)+fund);;
//		System.out.println(ps+"��");
	}
}
