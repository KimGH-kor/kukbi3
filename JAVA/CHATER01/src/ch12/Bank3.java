package ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bank3 {
	public static void main(String[] args) {
		int num;
		String name;
		long money;
		double hope;
		double addup;
		double susu = 0;
		int sun;
		HashMap<Integer,User> user = new HashMap<>();
		boolean roop = true;
		Scanner sc = new Scanner(System.in);
		line();
		while(roop) {
			System.out.println("1.유저등록 2.유저 현황 3.유저 변경 4.종료");
			int select = sc.nextInt();
			switch (select) {
			case 1: 
				System.out.println("고객 번호");
				num = sc.nextInt();
				System.out.println("성명");
				name = sc.next();
				System.out.println("FUND금액");
				money = sc.nextInt();
				System.out.println("희망 수익률");
				addup = sc.nextDouble();
				System.out.println("순수익률");
				money = sc.nextInt();
				System.out.println("수수료율");
				susu = sc.nextDouble();
				user.put(num, new User(num,name,money,addup,susu));
				System.out.println("고객번호 : "+ user.get(num).getNum());
				System.out.println("고객이름 : "+ user.get(num).getName());
				System.out.println("FUND금액 : "+user.get(num).getFund());
				System.out.println("희망 수익률 : "+user.get(num).getAdd()+"%");
				System.out.println("순수익률 : "+user.get(num).getName());
				System.out.println("수수료율 : "+user.get(num).getName()); 
				line();
				break;
				
			case 2:
				for(int i : user.keySet() ) {
					System.out.println("고객님 번호 : "+ user.get(i).getNum());
					System.out.println("고객님 이름 : "+ user.get(i).getName());
					System.out.println("고객님 이름 : "+ user.get(i).getName());
					System.out.println(user.get(i).getName()+"고객님 FUND금액 : "+user.get(i).getFund());
					System.out.println(user.get(i).getName()+"고객님 원하는 이익률 : "+user.get(i).getAdd()+"%");
					System.out.println("수수료를 뺀 "+user.get(i).getName() +"님이 원하는 순수익  : "+user.get(i).count()+"원");
					line();
				}
				
				break;
			case 3:
				System.out.println("바꾸실 분의 고객넘버를 입력해 주세요");
				int rename = sc.nextInt();
				int temp= -1;
				for(int i : user.keySet() ) {
					if(rename == user.get(i).getNum()){
						temp = i;
					}
				}
				if(temp == -1) {
					System.out.println("없는 고객입니다.");
				}else {
					System.out.println("고객 번호를 입력하세요");
					user.get(temp).setNum(sc.nextInt());
					System.out.println("성명을 입력하세요");
					user.get(temp).setName(sc.next());
					System.out.println("FUND금액을 입력하세요");
					user.get(temp).setFund(sc.nextInt());
					System.out.println("원하는 수익을 입력하세요");
					user.get(temp).setAdd(sc.nextInt());
					line();
				}
				break;
			case 4:
				roop = false;
				System.out.println("이용해 주셔서 감사합니다.");
				line();
				break;

			}
		}
	
		}
	public static void line() {
		System.out.println("*********************************************************");
	}
}
