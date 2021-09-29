package ch05.°´Ã¼¿¬½À;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		
		
		for(int i = 0; i < sb.length();) {
				System.out.println(sb.toString());
				sb.deleteCharAt(sb.length()-1);
			}
		
		
	}
}
