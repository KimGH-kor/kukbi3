package ch12;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank2 {
	public static void main(String[] args) {
		int num;
		String name;
		long money;
		long addup;
		int susu = 0;
		int sun;
		ArrayList<User> user = new ArrayList<>();
		boolean roop = true;
		Scanner sc = new Scanner(System.in);
		line();
		while(roop) {
			System.out.println("1.������� 2.���� ��Ȳ 3.���� ���� 4.����");
			int select = sc.nextInt();
			switch (select) {
			case 1: 
				System.out.println("�� ��ȣ�� �Է��ϼ���");
				num = sc.nextInt();
				System.out.println("������ �Է��ϼ���");
				name = sc.next();
				System.out.println("FUND�ݾ��� �Է��ϼ���");
				money = sc.nextInt();
				System.out.println("���ϴ� ���ͷ��� �Է����ּ���.");
				addup = sc.nextInt();
				System.out.println("���� ���������� �Է����ּ���");
				susu = sc.nextInt();
				user.add(new User(num,name,money,addup,susu));
				line();
				break;
				
			case 2:
				for(int i = 0; i < user.size(); i++) {
					System.out.println("���� ��ȣ : "+ user.get(i).getNum());
					System.out.println("���� �̸� : "+ user.get(i).getName());
					System.out.println(user.get(i).getName()+"���� FUND�ݾ� : "+user.get(i).getFund());
					System.out.println(user.get(i).getName()+"���� ���ϴ� ���ͷ� : "+user.get(i).getAdd()+"%");
					System.out.println("�����Ḧ �� "+user.get(i).getName() +"���� ���ϴ� ������  : "+user.get(i).count()+"��");
					line();
				}
				
				break;
			case 3:
				System.out.println("�ٲٽ� ���� ������ �Է��� �ּ���");
				String rename = sc.next();
				int temp= -1;
				for(int i = 0; i< user.size();i++) {
					if(rename.equals(user.get(i).getName())) {
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
