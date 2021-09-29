package ch04;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		int result = 0;
		boolean add = true;
		
		StringTokenizer st = new StringTokenizer("1-2-3+4","+-",true);
		while(st.hasMoreTokens()) {
			String tk = st.nextToken();
			
			if(tk.equals("+")) {
				add = true;
			}else if(tk.equals("-")) {
				add = false;
			}else {
				if(add == true) {
					result += Integer.parseInt(tk);
				}else{
					result -= Integer.parseInt(tk);
				}
			}
		}
		System.out.println(result);
		
	}
	
}
