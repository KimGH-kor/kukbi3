package ch01.코딩테스트용;

import java.util.Scanner;

public class num1120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		char a[] = new char[A.length()];
		char b[] = new char[B.length()];
		int count;
		int temp = 50;
		
		//1. 배열 만들기
		for(int i =0; i<A.length(); i++) {
			a[i] = A.charAt(i);
		}
		for(int i =0; i<B.length(); i++) {
			b[i] = B.charAt(i);
		}
		//2. 브루트 포스로 배열 비교하고 a를 b+1이랑 비교 또 한번더 할때는 b+2 해서 count가 가장 작은거 찾기
		for(int i = 0; i < B.length()-A.length()+1; i++) {//b배열
			count = 0;
			for(int j = 0; j < A.length(); j++) {//a배열
				if(a[j] != b[j+i]) {
					count++;
				}
			}
			if(count < temp) {
				temp = count;
			}
		}
		System.out.println(temp);
	}
}
