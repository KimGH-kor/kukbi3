package ch01.�ڵ��׽�Ʈ��;

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
		
		//1. �迭 �����
		for(int i =0; i<A.length(); i++) {
			a[i] = A.charAt(i);
		}
		for(int i =0; i<B.length(); i++) {
			b[i] = B.charAt(i);
		}
		//2. ���Ʈ ������ �迭 ���ϰ� a�� b+1�̶� �� �� �ѹ��� �Ҷ��� b+2 �ؼ� count�� ���� ������ ã��
		for(int i = 0; i < B.length()-A.length()+1; i++) {//b�迭
			count = 0;
			for(int j = 0; j < A.length(); j++) {//a�迭
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
