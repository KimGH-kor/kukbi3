package ch06자료구조.ATM;

public class Account {
	private String name, no, pw;
	private int bal;
	
	Account(String name, String no, String pw, int bal){
		this.name = name;
		this.no = no;
		this.pw = pw;
		this.bal = bal;
	}
	Account(String name, String no, String pw){//잔고가 주어지지 않았을때
		this(name, no, pw, 0);
	}
	
	void deposit(int amnt) {//입금하기 : amnt(입금액) 만큼 bal을 증가시킴.
		bal += amnt;
	}
	
	int withdraw(int amnt, String pw) {//출금하기 : pw확인 후 amnt만큼 bal을 감소.
		if(!pw.equals(this.pw)){
			System.out.println("비밀번호가 다릅니다.");
			return 0;
		}
		if(bal < amnt) {//출금 가능한 잔고가 되는지?
			System.out.println("잔고 부족");
			return 0;
		}
		bal -= amnt;//출금
		System.out.println(amnt+"의 금액이 출금 되어 "+ bal +"이 되었습니다.");
		return amnt;//출금액 반환 = return으로 박는 이유는 송금 부분에서 재사용하기 위함

	}
	//sendAcc amnt만큼 송금
	boolean send(Account sendAcc, int amnt, String pw) {//송금하기
		int result = withdraw(amnt, pw);
		if(result == 0) {
			System.out.println("송금에 실패하셨습니다.");
			return false;
		}
		sendAcc.deposit(result);//출금된 금액을 상대 계좌에 입금
		return true;
	}
	
	void show(String pw) {
		if(this.pw.equals(pw)) {
			System.out.println(name+"님의 잔액 : "+bal);
		}else {
			System.out.println("비밀번호 틀림");
		}
		
	}
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public String getPw() {
		return pw;
	}
	public int getBal() {
		return bal;
	}

}
