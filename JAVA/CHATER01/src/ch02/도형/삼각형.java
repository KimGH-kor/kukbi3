package ch02.µµÇü;

public class »ï°¢Çü extends µµÇü{
	double wid, hei;
	»ï°¢Çü(double wid, double hei){
		this.wid = wid;
		this.hei = hei;
	}
	
	@Override
	double area() {
		return wid*hei/2;
	}

}
