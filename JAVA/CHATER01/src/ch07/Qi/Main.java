package ch07.Qi;

public class Main {
	public static void main(String[] args) {
		삼각형 ta = new 삼각형(5, 5, 0, 0);
		삼각형 ta1 = (삼각형)ta.clone();
		
		사각형 rt = new 사각형(3, 3, 5, 5);
		사각형 rt1 = (사각형)rt.clone();
				
		원 cc = new 원(5, 10, 10);
		원 cc1 = (원)cc.clone();
		
		System.out.println(ta.toString());
		System.out.println(ta1.toString());
		System.out.println(rt.toString());
		System.out.println(rt1.toString());
		System.out.println(cc.toString());
		System.out.println(cc1.toString());
		
		
		
		
	}
	static void show(Shape s) {
		System.out.println("x의 좌표 "+s.x+" y의 좌표는 "+s.y+" 넓이는 "+s.area());
	}
}
