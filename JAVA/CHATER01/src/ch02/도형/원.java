package ch02.도형;

public class 원 extends 도형{

	double 반지름;
	원(double 반지름){
		this.반지름 = 반지름;
		
	}
	
	@Override
	double area() {
		return 반지름 * 반지름 *3.14;
	}
}
