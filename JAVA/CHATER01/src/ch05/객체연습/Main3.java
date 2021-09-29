package ch05.°´Ã¼¿¬½À;

import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		String str = "spam ham Spam HaM SPAM";
		String re = str.toLowerCase();
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(re," ");
		while(st.hasMoreTokens()) {
			String str2 = st.nextToken();	
			if(str2.equals("spam")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
