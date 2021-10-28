package ch12;

public class User {
	private int num;//고객넘버
	private String name;//고객이름
	private long fund;//투자 할 돈
	private double add;// 바라는 이익률
	private double susu;//은행 수수료
	
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

	//순이익률 구하기
	public double count() {
		return ((add-susu)*fund/100)+fund;
	}
}
