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
		System.out.println("1.�Է� 2.��� 3.����");
		int select = sc.nextInt();
		String stemp;
		String stemp2;
		int itemp;
		
		switch (select) {
		case 1 :{
			System.out.println("�й� :");
			stemp = sc.next();
			System.out.println("�̸� :");
			stemp2 = sc.next();
			System.out.println("���� :");
			itemp = sc.nextInt();
			arr.add(new Info(stemp,stemp2,itemp));
			break;
		}
		case 2 :{
			Iterator<Info> it = arr.iterator();
			while(it.hasNext()) {
				Info a = it.next();
				System.out.println(a.�̸�+" "+a.�й�+" "+a.����);
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
