package ch02.����;

public class Main {
	public static void main(String[] args) {
		ani[] arr = new ani[3];
		arr[0] = new cat();
		arr[1] = new dog();
		arr[2] = new mong();
		
		for(int i =0; i < arr.length; i++) {
			arr[i].sound();
		}
	}
}
