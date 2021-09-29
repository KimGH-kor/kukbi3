package ch07.Qi;

public class »ï°¢Çü extends Shape implements Cloneable{

	int wid, hir;
	
	
	public »ï°¢Çü(int a, int b, int c, int d) {
		super(c,d);
		wid = a;
		hir = b;
	}

	@Override
	double area() {
		return (double)(wid*hir)/2;
	}
	@Override
	public boolean equals(Shape s) {
		if(this.area()==s.area()) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	protected Object clone(){
		try{
			return super.clone();
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public String toString() {
		return "xÀÇ ÁÂÇ¥ "+super.x+" yÀÇ ÁÂÇ¥´Â "+super.y+" ³ĞÀÌ´Â "+this.area();
	}
}
