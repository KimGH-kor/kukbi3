package ch06자료구조.ATM;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
	static int C = 0;
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			HashMap<String, Account2> account = new HashMap<String, Account2>();
			
			int A;//화면 1숫자 받아오는 변수
			int A2;//화면 1숫자 받아오는 변수
			String B;// 문자 받아오는 변수
			String B1;// 문자 받아오는 변수
			String B2;// 문자 받아오는 변수
			int D;// 위치 찾는 변수
			int D1;//송금 계좌 위치 찾는 변수
			String E;
			
			boolean tu = true;//반복문 탈출
			
			while(tu) {
				System.out.println("1.회원등록 2.회원정보 3.카드넣기 4.종료");
				A = sc.nextInt();
				line();
				switch (A) {
				case 1 :

					System.out.println("이름을 입력해 주세요");
					B = sc.next();//문자열 받아오는 변수
					System.out.println("계좌번호를 입력해 주세요 ex)1234-1234");
					B1 = sc.next();
					A = find(account,B1);
					if(A == -1) {
						System.out.println("중복된 계좌입니다.");
					}else {
					if(B1.length() > 9 && B1.charAt(4) != '-') {
						System.out.println("잘못 입력하셨습니다.");
						break;
					}
					System.out.println("패스워드 4자리를 입력해 주세요");
						B2 = sc.next();
						if(B2.length() >4) {
							System.out.println("잘못 입력하셨습니다.");
						}
					System.out.println("처음 입금 하실 금액을 입력해주세요");
					A = sc.nextInt();//숫자 받아오는 변수
					account.put(B1, new Account2(B,B1,B2,A)); 
					C++;
					}
					line();
					break;
				case 2 : 
					showInfo(account);
					line();
					break;
				
				case 3 :
					showInfo(account);//가시성을 위한 출력
					System.out.println("로그인 할 계좌를 선택해 주세요.");
					B = sc.next();//문자열 받아오는 변수
					D = find(account,B);
					E = B;
					if(D == -1) {
					boolean tu1 = true;
					while(tu1) {
						System.out.println("현재 로그인 된 계좌는 "+account.get(E).getNo()+"입니다.");
						System.out.println("1.입금 2.출금 3.송금 4.잔액 조회 5.종료");
						A = sc.nextInt();
					    switch (A) {
						case 1: {
							System.out.println("입금 할 금액을 입력해 주세요");
							A = sc.nextInt();
							account.get(E).deposit(A);
							System.out.println(A+"의 금액이 입금 되어 "+account.get(E).getBal()+"이 되었습니다.");
							break;
						}
						case 2: {
							System.out.println("비밀번호를 입력해 주세요");
							B = sc.next();
							System.out.println("출금 할 금액을 입력해 주세요");
							A = sc.nextInt();
							account.get(E).withdraw(A, B);
							break;
						}
						case 3: {
							System.out.println("송금 할 계좌번호을 입력해 주세요");
							B = sc.next();
							System.out.println("현재 계좌의 비밀번호를 입력해 주세요");
							B1 = sc.next();
							System.out.println("송금 할 금액을 입력해 주세요");
							A = sc.nextInt();
							D1 = find(account,B);
							account.get(E).send(account.get(B), A, B1);
							break;
						}
						case 4: {
							System.out.println("비밀번호를 입력해 주세요");
							B = sc.next();
							account.get(E).show(B);
							break;
						}
						case 5: {
							tu1 = false;
							break;
						}
						default:
							System.out.println("번호를 잘못 누르셨습니다.");
						}
						
					}
					break;
					}else {
						System.out.println("잘못 입력하셨습니다.");
						break;
					}
				case 4 : 
					System.out.println("시스탬을 종료합니다.");
					tu = false;//탈출
					line();
					break;
				
				default:
					System.out.println("번호를 잘못 누르셨습니다.");

				}
			}
		}
		public static int find(HashMap<String, Account2> account, String no) {//재고 위치 찾아서 아웃에 넣어주기
				if(account.get(no)==null) {
					return 0;
				}
			return -1;
		}
		
		public static void showInfo(HashMap<String, Account2> acc) {
			System.out.println("현재 회원 현황은");
				for(String word : acc.keySet()) {
					System.out.println(acc.get(word).getName()+" : "+acc.get(word).getNo());
				}
				System.out.println("입니다.");
		}
		public static void line() {
			System.out.println("====================================================");
		}
}
