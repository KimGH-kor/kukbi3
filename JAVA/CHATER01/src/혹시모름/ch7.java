package 혹시모름;

public class ch7 {
	public static void main(String[] args) {
		int temp1 = 1;
		int temp2 = 1;
		int temp3 = 1;
		int temp4 = 1;
		int temp5 = 1;
		int temp6 = 1;
		int temp7 = 1;
		
		for(int i = 111; i < 1000000; i++) {
			temp1 = i%10;
			temp2 = i/10%10;
			temp3 = i/100%10;
			temp4 = i/1000%10;
			temp5 = i/10000%10;
			temp6 = i/100000%10;
			temp7 = i/1000000%10;
			
		}
	}
}
