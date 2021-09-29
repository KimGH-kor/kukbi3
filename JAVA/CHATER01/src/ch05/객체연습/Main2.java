package ch05.객체연습;

public class Main2 {
	public static void main(String[] args) {
		Circle[] cc = new Circle[5];
		cc[0] = new Circle(0, 0, 3);
		cc[1] = new Circle(10, 10, 10);
		cc[2] = new Circle(15, 15, 15);
		cc[3] = new Circle(20, 20, 20);
		cc[4] = new Circle(25, 25, 25);
		
		int result = 0;
		double count = 0;
		for(int i = 0; i < cc.length; i++) {
			if(count < cc[i].area()) {
				count = cc[i].area();
				result = i;
			}
		}
		cc[result].show();
		Cir(cc);
		bac(cc[0],cc[1]);
		
	}
	static void Cir(Circle[] arr) {
		double result = 0;
		for(int i = 0;i< arr.length; i++) {
			result += arr[i].area();
		}
		System.out.println("평균 넓이는 "+(result /= arr.length));
	}
	static int back(Circle a, Circle b) {
		int c = a.x-b.x;
		int d = a.y-b.y;
		return (int)Math.sqrt((c*c)+(d*d));
	}
	static void bac(Circle a, Circle b) {
		int c = back(a,b);//떨어져있는 거리
		int d = a.radius+b.radius;// 반지름을 합한거
		
		if((c-d)>0) {
			System.out.println("떨어져있습니다.");
		}else if((c-d)==0) {
			System.out.println("닿아있습니다.");
		}else {
			System.out.println("곂쳐져 있습니다.");
		}
		
	}
}
