package ch03.���⼭��.function;

import ch03.���⼭��.interpace.Lendable;

public class SeparateVolume implements Lendable{

	String requestNo;//û����ȣ
	String bookTitle;//����
	String writer;//����
	String borrower;//������
	String checkOutDate;//������
	byte state;//�������
	
	public SeparateVolume(String requesNo, String bookTitle, String writer) {
		this.requestNo = requesNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	
	@Override
	public void checkIn(String borrower, String date) {
		if(state != 0) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*"+bookTitle + "��(��) ����Ǿ����ϴ�.");
		System.out.println("������ : "+borrower);
		System.out.println("������ : "+checkOutDate+"\n");
	}

	@Override
	public void checkOut() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*"+bookTitle+"��(��) �ݳ��Ǿ����ϴ�.\n");
	}

}
