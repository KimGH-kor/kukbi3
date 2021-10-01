package 혹시모름;

public class ch4 {
	public static void main(String[] args) {
		double sum = 0;
		for(double i =1; i<20000;i++) {
			if(sum >= 10) {
				sum = i;
				break;
			}
			
			sum = 0;
			for(double j = 1; j <= i; j++) {
				sum += (1/j);
			}
		}
		System.out.println(sum);
	}
}
