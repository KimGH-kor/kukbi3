package ch03.카드;

import ch03.카드.상속.Account;
import ch03.카드.상속.CheckingAccount;

public class Main {
	public static void main(String[] args) {
		Account obj = new Account(111-22-333333,"홍길동",1000000);
		if(obj instanceof CheckingAccount) {
			pay((CheckingAccount)obj);
		}else {
			System.out.println("캐스트할 수 없는 타입입니다.");
		}
	}
	static void pay(CheckingAccount obj) {
		try {
			int amont = obj.pay(5555-6666-7777-8888, 47000);
			System.out.println("인출액 : "+amont);
			System.out.println("카드번호 : "+obj.num);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
