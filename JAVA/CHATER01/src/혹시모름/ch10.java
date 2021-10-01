package 혹시모름;

public class ch10 {
	public static void main(String[] args) {
		long a,b,c;
		int n=0;
		for(a = 1; a < 1000; a++) {
			for(b = 1; b < 1000; b++) {
				for(c = 1; c < 1000; c++) {
					if((a<b)&&(a*a+b*b == c*c)) {
						if((a*b)/2 < 10000) {
							n++;	
						}
						
					}
				}
					
			}
				
		}
		System.out.println(n);
			
	}
}
