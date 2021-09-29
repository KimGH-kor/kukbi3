package ch07;

public class Main2 {
	public static void main(String[] args) {
		Object cr = new Circle(10);
		Circle cr1 = new Circle(10);
		
		if(cr.equals(cr1)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}
}
