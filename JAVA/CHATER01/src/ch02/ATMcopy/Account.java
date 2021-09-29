package ch02.ATMcopy;

public class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	Account(){}
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount)throws Exception {
	if(balance < amount) {
		System.out.println("ÀÜ¾× ºÎÁ·");
		}else {
			balance -= amount;
		}
	return amount;
	}
	
}
