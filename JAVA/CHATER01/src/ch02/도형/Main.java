package ch02.도형;

public class Main {
	public static void main(String[] args) {
		도형[] arr = new 도형[3];
		arr[0] = new 삼각형(2,3);
		arr[1] = new 사각형(5,2);
		arr[2] = new 원(5);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].area());
		}
		
	}
}
