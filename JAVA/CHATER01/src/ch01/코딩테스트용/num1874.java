package ch01.�ڵ��׽�Ʈ��;

import java.util.Scanner;
import java.util.Stack;

public class num1874 {
public static void main(String[] args) {
	//��� �������� N
	//������� ���� 1~N��
	//M���� ����� �ɷ��� ��� �ؾ��ϳ�
	Scanner sc = new Scanner(System.in);
	Stack<Integer> stack = new Stack<>();
	StringBuffer sb = new StringBuffer();
	
	int N = sc.nextInt();
	
	int B = 1;//�ε���
	int C;//���� �޾ƿ�
	
//	stack.push(C);
//	C++;
//	System.out.println("+");
	for(int i = 0; i < N; i++) {
		C = sc.nextInt();
		if(B <= C) {
			while(B < C) {
				stack.push(C);
				System.out.println("+");
				B++;
			}
		stack.pop();
		System.out.println("-");
		}else if(B > C) {
			if(stack.isEmpty()) {
				System.out.println("NO");
				return;
			}else {
				while(!stack.isEmpty()&&stack.peek() >= C) {
					stack.pop();
					System.out.println("-");
				}
			}
		}
	}				
}
}

