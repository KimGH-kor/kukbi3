package ch01.코딩테스트용;

import java.util.Scanner;

public class num1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result[] = new int[1001];
		int count = 1;
		int count2 = 0;
		int sum = 0;
		
		while(count2 != 1000){
			for(int i = 0; i<count; i++) {
				if(count2 == 1000) {
					break;
				}else {
				result[count2] = count;
				count2++;
				}
			}
			count++;
		}
		for(int i = A-1; i < B; i++) {
			sum += result[i];
		}
		System.out.println(sum);
	}
}
