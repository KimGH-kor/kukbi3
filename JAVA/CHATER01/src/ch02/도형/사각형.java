package ch02.도형;

public class 사각형 extends 도형{
	double wid, hei;
	사각형(double wid, double hei){
		this.wid = wid;
		this.hei = hei;
	}
	
	@Override
	double area() {
		return wid*hei;
	}
}
