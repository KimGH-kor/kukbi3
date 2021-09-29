package ch06자료구조;

import java.util.HashMap;
import java.util.StringTokenizer;

public class WordCnt {
	public static void main(String[] args) {
		HashMap<String, Integer> w = new HashMap<>();
		String str = "C++ c++ javA jaVa Python c++";
		StringTokenizer st = new StringTokenizer(str.toLowerCase());
		
		while(st.hasMoreTokens()) {
			String tok = st.nextToken();
			Integer cnt = w.get(tok);
			
			if(cnt == null) {
				w.put(tok, 1);
			}else {
				w.put(tok,cnt+1);
			}
		}
		for(String word : w.keySet()) {
			Integer c = w.get(word);
			System.out.println(word+" : "+c);
		}
	}
}
