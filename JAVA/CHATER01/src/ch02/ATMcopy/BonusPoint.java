package ch02.ATMcopy;

public class BonusPoint extends Account{
	
	int bonus;
	
	public BonusPoint(String accountNo, String ownerName, int balance, int bonus) {
		super(accountNo,ownerName,balance);
		this.bonus = bonus;
	}

	@Override
	void deposit(int amount) {
		super.deposit(amount);
		bonus += (int)(amount*0.01);
	}
	
	
	
}
