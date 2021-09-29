package ch07.Qi;

public class ¿ø extends Shape implements Cloneable{

	int r;
	
	public ¿ø(int a, int b, int c) {
		super(b,c);
		r = a;
	}

	@Override
	double area() {
		return r*r*3.14;
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
