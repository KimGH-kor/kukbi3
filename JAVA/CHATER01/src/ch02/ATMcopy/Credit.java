package ch02.ATMcopy;

public class Credit extends Account{

	int creditLine;
	
	Credit(){}
	Credit(String accountNo, String ownerName, int balance, int creditLine){
		super(accountNo,ownerName,balance);
		this.creditLine = creditLine;
	}
	
	@Override
	int withdraw(int amount) throws Exception {
		if((balance + creditLine) < amount) {
			throw new Exception("인출이 불가능합니다.");
		}
		balance -= amount;
		return amount;
	}
	
}
