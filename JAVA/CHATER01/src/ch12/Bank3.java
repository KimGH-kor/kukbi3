package ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bank3 {
	public static void main(String[] args) {
		int num;
		String name;
		long money;
		double hope;
		double addup;
		double susu = 0;
		int sun;
		HashMap<Integer,User> user = new HashMap<>();
		boolean roop = true;
		Scanner sc = new Scanner(System.in);
		line();
		while(roop) {
			System.out.println("1.������� 2.���� ��Ȳ 3.���� ���� 4.����");
			int select = sc.nextInt();
			switch (select) {
			case 1: 
				System.out.println("�� ��ȣ");
				num = sc.nextInt();
				System.out.println("����");
				name = sc.next();
				System.out.println("FUND�ݾ�");
				money = sc.nextInt();
				System.out.println("��� ���ͷ�");
				addup = sc.nextDouble();
				System.out.println("�����ͷ�");
				money = sc.nextInt();
				System.out.println("��������");
				susu = sc.nextDouble();
				user.put(num, new User(num,name,money,addup,susu));
				System.out.println("����ȣ : "+ user.get(num).getNum());
				System.out.println("���̸� : "+ user.get(num).getName());
				System.out.println("FUND�ݾ� : "+user.get(num).getFund());
				System.out.println("��� ���ͷ� : "+user.get(num).getAdd()+"%");
				System.out.println("�����ͷ� : "+user.get(num).getName());
				System.out.println("�������� : "+user.get(num).getName()); 
				line();
				break;
				
			case 2:
				for(int i : user.keySet() ) {
					System.out.println("���� ��ȣ : "+ user.get(i).getNum());
					System.out.println("���� �̸� : "+ user.get(i).getName());
					System.out.println("���� �̸� : "+ user.get(i).getName());
					System.out.println(user.get(i).getName()+"���� FUND�ݾ� : "+user.get(i).getFund());
					System.out.println(user.get(i).getName()+"���� ���ϴ� ���ͷ� : "+user.get(i).getAdd()+"%");
					System.out.println("�����Ḧ �� "+user.get(i).getName() +"���� ���ϴ� ������  : "+user.get(i).count()+"��");
					line();
				}
				
				break;
			case 3:
				System.out.println("�ٲٽ� ���� ���ѹ��� �Է��� �ּ���");
				int rename = sc.nextInt();
				int temp= -1;
				for(int i : user.keySet() ) {
					if(rename == user.get(i).getNum()){
						temp = i;
					}
				}
				if(temp == -1) {
					System.out.println("���� ���Դϴ�.");
				}else {
					System.out.println("�� ��ȣ�� �Է��ϼ���");
					user.get(temp).setNum(sc.nextInt());
					System.out.println("������ �Է��ϼ���");
					user.get(temp).setName(sc.next());
					System.out.println("FUND�ݾ��� �Է��ϼ���");
					user.get(temp).setFund(sc.nextInt());
					System.out.println("���ϴ� ������ �Է��ϼ���");
					user.get(temp).setAdd(sc.nextInt());
					line();
				}
				break;
			case 4:
				roop = false;
				System.out.println("�̿��� �ּż� �����մϴ�.");
				line();
				break;

			}
		}
	
		}
	public static void line() {
		System.out.println("*********************************************************");
	}
}
