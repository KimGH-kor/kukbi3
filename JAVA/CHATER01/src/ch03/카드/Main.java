package ch03.ī��;

import ch03.ī��.���.Account;
import ch03.ī��.���.CheckingAccount;

public class Main {
	public static void main(String[] args) {
		Account obj = new Account(111-22-333333,"ȫ�浿",1000000);
		if(obj instanceof CheckingAccount) {
			pay((CheckingAccount)obj);
		}else {
			System.out.println("ĳ��Ʈ�� �� ���� Ÿ���Դϴ�.");
		}
	}
	static void pay(CheckingAccount obj) {
		try {
			int amont = obj.pay(5555-6666-7777-8888, 47000);
			System.out.println("����� : "+amont);
			System.out.println("ī���ȣ : "+obj.num);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
