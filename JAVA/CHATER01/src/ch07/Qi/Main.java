package ch07.Qi;

public class Main {
	public static void main(String[] args) {
		�ﰢ�� ta = new �ﰢ��(5, 5, 0, 0);
		�ﰢ�� ta1 = (�ﰢ��)ta.clone();
		
		�簢�� rt = new �簢��(3, 3, 5, 5);
		�簢�� rt1 = (�簢��)rt.clone();
				
		�� cc = new ��(5, 10, 10);
		�� cc1 = (��)cc.clone();
		
		System.out.println(ta.toString());
		System.out.println(ta1.toString());
		System.out.println(rt.toString());
		System.out.println(rt1.toString());
		System.out.println(cc.toString());
		System.out.println(cc1.toString());
		
		
		
		
	}
	static void show(Shape s) {
		System.out.println("x�� ��ǥ "+s.x+" y�� ��ǥ�� "+s.y+" ���̴� "+s.area());
	}
}
