package ch03.대출서비스.function;

import ch03.대출서비스.interpace.Lendable;

public class AppCDInfo extends CDInfo implements Lendable {

	String borrower;//대출인
	String checkOutDate;//대출일
	byte state;//대출상태
	
	public AppCDInfo(String registerNo, String title){
		super(registerNo, title);
	}
	
	@Override
	public void checkIn(String borrower, String date) {
		if(state != 0) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*"+ title + "CD가 대출되었습니다.");
		System.out.println("대출인 : "+borrower);
		System.out.println("대출일 : "+checkOutDate+"\n");
	}

	@Override
	public void checkOut() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*"+title+"CD가 반납되었습니다.\n");
	}
}
