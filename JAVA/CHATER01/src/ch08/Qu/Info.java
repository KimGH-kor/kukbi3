package ch08.Qu;

public class Info {
	String 학번,이름;
	int 점수;
	
	Info(String a, String b, int c){
		학번 = a;
		이름 = b;
		점수 = c;
		
	}
	
	public String get학번() {
		return 학번;
	}
	public void set학번(String 학번) {
		this.학번 = 학번;
	}
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public int get점수() {
		return 점수;
	}
	public void set점수(int 점수) {
		this.점수 = 점수;
	}
	
}
