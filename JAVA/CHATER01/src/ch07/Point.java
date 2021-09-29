package ch07;

public class Point {
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		String str = "x¿Í y°ªÀº "+ x +","+ y;
		return str;
	}

}
