package ch07.Qi;

public class 사각형 extends Shape implements Cloneable{

	int wid, hir;
	
	
	public 사각형(int a, int b, int c, int d) {
		super(c,d);
		wid = a;
		hir = b;
	}

	@Override
	double area() {
		return wid*hir;
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
		return "x의 좌표 "+super.x+" y의 좌표는 "+super.y+" 넓이는 "+this.area();
	}

}
