package ch01.코딩테스트용;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num11866 {
	public static void main(String[] args) {
		//n개의 갯수를 제공받음
		//큐이용 널고빼기를 M-1번반복 후 한번 넣기
		//배열이 n값이 되면 스탑
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> Q = new LinkedList<>();
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		int N = sc.nextInt();
		int K = sc.nextInt();
		int M[] = new int[N];
		int A;
		int B = 0;
		
		for(int i = 0; i < N; i++) {
			Q.add(i+1);
		}
		
		
		while(Q.size() != 0) {
			for(int i = 0; i < K-1;i++) {
				A = Q.remove();
				Q.add(A);
			}
			sb.append(Q.remove());
			sb.append(", ");
			B++;
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		System.out.println(sb.toString());
		
	}
}
