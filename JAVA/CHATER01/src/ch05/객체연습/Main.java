package ch05.°´Ã¼¿¬½À;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point(10,10);
		Point p2 = new Point(5);
		Point p4 = new Point(10,5);
		Point p3 = new Point();
		Point p5 = new Point(20,20);
		p1.show();
		p2.show();
		p3.show();
		p4.show();
		p5.show();
		int result = bac(p1,p2);
		System.out.println(result);
		
	}
	static int bac(Point a, Point b) {
		int c = a.x-b.x;
		int d = a.y-b.y;
		return (int)Math.sqrt((c*c)+(d*d));
	}
	
	static int bac(Point a, Point b, Point c) {
		int d = bac(a, b);
		int e = bac(a, c);
		int f = bac(b, c);
		return d+e+f;
	}
}
