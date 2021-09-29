package ch08.Qu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		ArrayList<Info> arr = new ArrayList<Info>();
		boolean end = true;
		
		while(end) {
		System.out.println("1.입력 2.출력 3.종료");
		int select = sc.nextInt();
		String stemp;
		String stemp2;
		int itemp;
		
		switch (select) {
		case 1 :{
			System.out.println("학번 :");
			stemp = sc.next();
			System.out.println("이름 :");
			stemp2 = sc.next();
			System.out.println("점수 :");
			itemp = sc.nextInt();
			arr.add(new Info(stemp,stemp2,itemp));
			break;
		}
		case 2 :{
			Iterator<Info> it = arr.iterator();
			while(it.hasNext()) {
				Info a = it.next();
				System.out.println(a.이름+" "+a.학번+" "+a.점수);
			}
			break;
		}
		case 3 :{
			end = false;
			break;
		}
		}
		}
	}
}
