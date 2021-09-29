package ch07.Qi;

public abstract class Shape {
	int x, y;
	
	public Shape() {}
	
	public Shape(int a) {
		x = a;
	}
	public Shape(int a, int b){
		x=  a;
		y = b;
	}
	
	abstract double area();

	abstract public boolean equals(Shape s); 
}
