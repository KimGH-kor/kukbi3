package ch01.�ڵ��׽�Ʈ��;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num11866 {
	public static void main(String[] args) {
		//n���� ������ ��������
		//ť�̿� �ΰ��⸦ M-1���ݺ� �� �ѹ� �ֱ�
		//�迭�� n���� �Ǹ� ��ž
		
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
