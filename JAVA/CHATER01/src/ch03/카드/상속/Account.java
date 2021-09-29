package ch03.카드.상속;

public class Account {
	String name;
	int num;
	int money;
	
	public Account(){
		
	}
	public Account(int num, String name, int money){
		this.name = name;
		this.money = money;
		this.num = num;
	}
	public int pay(int num, int money) {
		if(this.num == num) {
			return money;
		}
		return -1;
	}

}
