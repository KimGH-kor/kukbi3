package ch06�ڷᱸ��.ATM;

public class Account {
	private String name, no, pw;
	private int bal;
	
	Account(String name, String no, String pw, int bal){
		this.name = name;
		this.no = no;
		this.pw = pw;
		this.bal = bal;
	}
	Account(String name, String no, String pw){//�ܰ� �־����� �ʾ�����
		this(name, no, pw, 0);
	}
	
	void deposit(int amnt) {//�Ա��ϱ� : amnt(�Աݾ�) ��ŭ bal�� ������Ŵ.
		bal += amnt;
	}
	
	int withdraw(int amnt, String pw) {//����ϱ� : pwȮ�� �� amnt��ŭ bal�� ����.
		if(!pw.equals(this.pw)){
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			return 0;
		}
		if(bal < amnt) {//��� ������ �ܰ� �Ǵ���?
			System.out.println("�ܰ� ����");
			return 0;
		}
		bal -= amnt;//���
		System.out.println(amnt+"�� �ݾ��� ��� �Ǿ� "+ bal +"�� �Ǿ����ϴ�.");
		return amnt;//��ݾ� ��ȯ = return���� �ڴ� ������ �۱� �κп��� �����ϱ� ����

	}
	//sendAcc amnt��ŭ �۱�
	boolean send(Account sendAcc, int amnt, String pw) {//�۱��ϱ�
		int result = withdraw(amnt, pw);
		if(result == 0) {
			System.out.println("�۱ݿ� �����ϼ̽��ϴ�.");
			return false;
		}
		sendAcc.deposit(result);//��ݵ� �ݾ��� ��� ���¿� �Ա�
		return true;
	}
	
	void show(String pw) {
		if(this.pw.equals(pw)) {
			System.out.println(name+"���� �ܾ� : "+bal);
		}else {
			System.out.println("��й�ȣ Ʋ��");
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
