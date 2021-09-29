package ch07;

public class RefTypeExample2 {
	public static void main(String[] args) {
		Point obj = new Point(10,20);
		System.out.println(obj.x+", "+obj.y);
		rearrange(obj);
		System.out.println(obj.x+", "+obj.y);
	}
	public static void rearrange(Point point) {
		point.x = 30;
		point.y = 40;
	}
}
