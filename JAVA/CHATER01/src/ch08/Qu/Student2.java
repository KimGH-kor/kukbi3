package ch08.Qu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Student2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		HashMap<String, Info> hm = new HashMap<>();
		
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
			
			hm.put(stemp,new Info(stemp,stemp2,itemp));
			break;
		}
		case 2 :{
			Info a = hm.get("1212");
			for(String key : hm.keySet()) {
				Info s = hm.get(key);
				System.out.println(key+" "+s.get�̸�()+" "+s.get����());
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
