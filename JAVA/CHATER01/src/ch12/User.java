package ch12;

public class User {
	private int num;//���ѹ�
	private String name;//���̸�
	private long fund;//���� �� ��
	private double add;// �ٶ�� ���ͷ�
	private double susu;//���� ������
	
	public User(int num, String name, long fund, double add, double susu) {
		this.num = num;
		this.name = name;
		this.fund = fund;
		this.add = add;
		this.susu = susu;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getFund() {
		return fund;
	}
	public void setFund(int fund) {
		this.fund = fund;
	}
	public double getAdd() {
		return add;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	public double getSusu() {
		return susu;
	}
	public void setSusu(long susu) {
		this.susu = susu;
	}

	//�����ͷ� ���ϱ�
	public double count() {
		return ((add-susu)*fund/100)+fund;
	}
}
