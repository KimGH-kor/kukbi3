package ch03.ī��.���;

public class CheckingAccount extends Account{
	String name;
	public int num;
	int money;
	CheckingAccount(String name, int num, int money){
		super(num, name, money);
	}
	public int pay(int num, int money) {
		if(this.num == num) {
			return money;
		}
		return -1;
	}

}
