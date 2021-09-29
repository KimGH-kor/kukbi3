package ch05.°´Ã¼¿¬½À;

public class Point {
	int x;
	int y;
	public Point() {
		this(0,0);
	}
	public Point(int n) {
		this(n,n);
	}
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void show() {
		System.out.println(x+","+y);
	}
}
