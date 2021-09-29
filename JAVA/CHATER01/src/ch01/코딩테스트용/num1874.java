package ch01.코딩테스트용;

import java.util.Scanner;
import java.util.Stack;

public class num1874 {
public static void main(String[] args) {
	//몇개가 들어오는지 N
	//순서대로 들어옴 1~N개
	//M개의 출력이 될려면 어떻게 해야하냐
	Scanner sc = new Scanner(System.in);
	Stack<Integer> stack = new Stack<>();
	StringBuffer sb = new StringBuffer();
	
	int N = sc.nextInt();
	
	int B = 1;//인덱스
	int C;//값을 받아옴
	
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

