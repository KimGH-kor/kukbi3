package ch03.���⼭��.function;

import ch03.���⼭��.interpace.Lendable;

public class AppCDInfo extends CDInfo implements Lendable {

	String borrower;//������
	String checkOutDate;//������
	byte state;//�������
	
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
		System.out.println("*"+ title + "CD�� ����Ǿ����ϴ�.");
		System.out.println("������ : "+borrower);
		System.out.println("������ : "+checkOutDate+"\n");
	}

	@Override
	public void checkOut() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*"+title+"CD�� �ݳ��Ǿ����ϴ�.\n");
	}
}
