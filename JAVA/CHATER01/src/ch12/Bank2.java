package ch12;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank2 {
	public static void main(String[] args) {
		int num;
		String name;
		long money;
		long addup;
		int susu = 0;
		int sun;
		ArrayList<User> user = new ArrayList<>();
		boolean roop = true;
		Scanner sc = new Scanner(System.in);
		line();
		while(roop) {
			System.out.println("1.유저등록 2.유저 현황 3.유저 변경 4.종료");
			int select = sc.nextInt();
			switch (select) {
			case 1: 
				System.out.println("고객 번호를 입력하세요");
				num = sc.nextInt();
				System.out.println("성명을 입력하세요");
				name = sc.next();
				System.out.println("FUND금액을 입력하세요");
				money = sc.nextInt();
				System.out.println("원하는 이익률을 입력해주세요.");
				addup = sc.nextInt();
				System.out.println("은행 수수료율을 입력해주세요");
				susu = sc.nextInt();
				user.add(new User(num,name,money,addup,susu));
				line();
				break;
				
			case 2:
				for(int i = 0; i < user.size(); i++) {
					System.out.println("고객님 번호 : "+ user.get(i).getNum());
					System.out.println("고객님 이름 : "+ user.get(i).getName());
					System.out.println(user.get(i).getName()+"고객님 FUND금액 : "+user.get(i).getFund());
					System.out.println(user.get(i).getName()+"고객님 원하는 이익률 : "+user.get(i).getAdd()+"%");
					System.out.println("수수료를 뺀 "+user.get(i).getName() +"님이 원하는 순수익  : "+user.get(i).count()+"원");
					line();
				}
				
				break;
			case 3:
				System.out.println("바꾸실 분의 성명을 입력해 주세요");
				String rename = sc.next();
				int temp= -1;
				for(int i = 0; i< user.size();i++) {
					if(rename.equals(user.get(i).getName())) {
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
