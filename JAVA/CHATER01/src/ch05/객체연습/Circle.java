package ch05.°´Ã¼¿¬½À;

public class Circle {
	int x,y,radius;
	public Circle(int x,int y, int r) {
		this.x = x;
		this.y = y;
		this.radius = r;
	}
	double area() {
		return radius*radius*3.14;
	}
	void show() {
		System.out.println(x+","+y+" ³ÐÀÌ´Â"+area());
	}
}
