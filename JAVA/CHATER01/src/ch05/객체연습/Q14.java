package ch05.°´Ã¼¿¬½À;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb =new StringBuffer(sc.next());
		
		for(int i=0;i < sb.length();) {
			System.out.println(sb);
			sb.deleteCharAt(0);
		}
	}
}

