package ch01.재고관리;

import java.util.Scanner;

public class Main {
	static int C = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Goods[] goods = new Goods[100];
		int A;//숫자 받아오는 변수
		String B;// 문자 받아오는 변수
		int D;// 위치 찾는 변수
		
		boolean tu = true;//반복문 탈출
		
		while(tu) {
			System.out.println("1.입고 2.출고 3.현황리스트 4.종료");
			A = sc.nextInt();
			line();
			switch (A) {
			case 1 :
				showInfo(goods);//가시성을 위한 출력
				System.out.println("입고 할 상품을 입력해 주세요.");
				B = sc.next();//문자열 받아오는 변수
				System.out.println("입고 할 상품 수를 입력해 주세요");
				A = sc.nextInt();//숫자 받아오는 변수
				D = find(goods,B);//이미 있는지 찾아서 있으면 for의 i를 없으면 -1 리턴
				if(D <0) {//없다면 새롭게 추가
				goods[C++] = new Goods(B,A); 
				}else {//있다면 있는것에 갯수 추가
					goods[D].in(A);
				}
				line();
				break;
			case 2 : 
				showInfo(goods);//어떤 제품이 있는지 가시성을 위한 출력
				System.out.println("출고 할 상품을 입력해 주세요.");
				B = sc.next();//문자열
				System.out.println("출고 할 상품 수를 입력해 주세요");
				A = sc.nextInt();//숫자
				D = find(goods,B);//이미 있는지 찾아서 있으면 for의 i를 없으면 -1 리턴
				if(D < 0){//없다면
					System.out.println("없는 상품입니다.");
					break;
				}else {//있다면
					goods[D].out(A);//A를 갯수를 비교하고 빼는 메서드
				}
				line();
				break;
			
			case 3 : 
				showInfo(goods);//현황을 보여주는 메서드
				line();
				break;
			
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
	public static int find(Goods[] goods, String good) {//재고 위치 찾아서 아웃에 넣어주기
		for(int i=0; i < C; i++) {
			if(goods[i].getGoods().equals(good)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void showInfo(Goods[] goods) {
		System.out.println("현재 재고 현황은");
			for(int i = 0; i < C; i++) {
				System.out.println(goods[i].getGoods()+"의 재고는 "+goods[i].getNum()+"개 입니다.");
			}
	}
	public static void line() {
		System.out.println("====================================================");
	}
}
