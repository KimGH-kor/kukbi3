package ch02.����;

public class �簢�� extends ����{
	double wid, hei;
	�簢��(double wid, double hei){
		this.wid = wid;
		this.hei = hei;
	}
	
	@Override
	double area() {
		return wid*hei;
	}
}
