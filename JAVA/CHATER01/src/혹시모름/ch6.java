package 혹시모름;

public class ch6 {
	public static void main(String[] args) {
		int a,b,c;
		int n=0;
		for(a = 1; a < 10000; a++) {
			for(b = 1; b < 10000; b++) {
				for(c = 1; c < 10000; c++) {
					if((a<b)&&(a*a+b*b==c*c)) {
						n++;
					}
				}
					
			}
				
		}
		System.out.println(n);
			
	}
}
