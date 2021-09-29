package ch01.ATM;

import java.util.Scanner;



public class Main {
	static int C = 0;
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Account[] account = new Account[100];
			int A;//화면 1숫자 받아오는 변수
			int A2;//화면 1숫자 받아오는 변수
			String B;// 문자 받아오는 변수
			String B1;// 문자 받아오는 변수
			String B2;// 문자 받아오는 변수
			int D;// 위치 찾는 변수
			int D1;//송금 계좌 위치 찾는 변수
			
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
					if(A != -1) {
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
					account[C] = new Account(B,B1,B2,A); 
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
					if(D >= 0) {
					boolean tu1 = true;
					while(tu1) {
						System.out.println("현재 로그인 된 계좌는 "+account[D].getNo()+"입니다.");
						System.out.println("1.입금 2.출금 3.송금 4.잔액 조회 5.종료");
						A = sc.nextInt();
					    switch (A) {
						case 1: {
							System.out.println("입금 할 금액을 입력해 주세요");
							A = sc.nextInt();
							account[D].deposit(A);
							System.out.println(A+"의 금액이 입금 되어 "+account[D].getBal()+"이 되었습니다.");
							break;
						}
						case 2: {
							System.out.println("비밀번호를 입력해 주세요");
							B = sc.next();
							System.out.println("출금 할 금액을 입력해 주세요");
							A = sc.nextInt();
							account[D].withdraw(A, B);
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
							account[D].send(account[D1], A, B1);
							break;
						}
						case 4: {
							System.out.println("비밀번호를 입력해 주세요");
							B = sc.next();
							account[D].show(B);
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
		public static int find(Account[] account, String no) {//재고 위치 찾아서 아웃에 넣어주기
			for(int i=0; i < C; i++) {
				if(account[i].getNo().equals(no)) {
					return i;
				}
			}
			return -1;
		}
		
		public static void showInfo(Account[] account) {
			System.out.println("현재 회원 현황은");
				for(int i = 0; i < C; i++) {
					System.out.println(account[i].getName()+": "+account[i].getNo()+"입니다.");
				}
		}
		public static void line() {
			System.out.println("====================================================");
		}
}
