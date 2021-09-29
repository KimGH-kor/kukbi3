package ch05.°´Ã¼¿¬½À;

import java.util.StringTokenizer;

public class Q12 {
	public static void main(String[] args) {
		String str = "spam ham Spam HaM SPAM";
		String re = str.toLowerCase();
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			String result = st.nextToken();
			if(result.equals("spam")) {
				result = "SPAM";
			}
			System.out.print(result+" ");
		}
	}
}
