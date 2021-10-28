package ch12;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		int num;//°í°´³Ñ¹ö
		String name;//°í°´ÀÌ¸§
		long fund;//ÅõÀÚÇÒ µ·
		double hope;//Èñ¸Á¼öÀÍ·ü
		double add;//¼ø¼öÀÍ·ü
		double susu = 0;//¼ö¼ö·áÀ²
		int sun;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("°í°´ ¹øÈ£");
		num = sc.nextInt();
		System.out.println("¼º¸í");
		name = sc.next();
		System.out.println("FUND±İ¾×");
		fund = sc.nextInt();
		System.out.println("Èñ¸Á ¼öÀÍ·ü");
		hope = sc.nextDouble();
		System.out.println("¼ö¼ö·áÀ²");
		susu = sc.nextDouble();
		System.out.println("¼ø¼öÀÍ·ü");
		add = sc.nextDouble();
		
		if(Math.round((hope-susu)*100)/100.0==add) {
			System.out.println("°í°´¹øÈ£ : "+ num);
			System.out.println("°í°´ÀÌ¸§ : "+ name);
			System.out.println("FUND±İ¾× : "+fund);
			System.out.println("Èñ¸Á ¼öÀÍ·ü : "+hope);
			System.out.println("¼ö¼ö·áÀ² : "+susu);
			System.out.println("¼ø¼öÀÍ·ü : "+add);	
		}
//		double ps = (((hope-susu)*fund/100)+fund);;
//		System.out.println(ps+"¿ø");
	}
}
