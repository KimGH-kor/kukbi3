package ch01.������;

import java.util.Scanner;

public class Main {
	static int C = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Goods[] goods = new Goods[100];
		int A;//���� �޾ƿ��� ����
		String B;// ���� �޾ƿ��� ����
		int D;// ��ġ ã�� ����
		
		boolean tu = true;//�ݺ��� Ż��
		
		while(tu) {
			System.out.println("1.�԰� 2.��� 3.��Ȳ����Ʈ 4.����");
			A = sc.nextInt();
			line();
			switch (A) {
			case 1 :
				showInfo(goods);//���ü��� ���� ���
				System.out.println("�԰� �� ��ǰ�� �Է��� �ּ���.");
				B = sc.next();//���ڿ� �޾ƿ��� ����
				System.out.println("�԰� �� ��ǰ ���� �Է��� �ּ���");
				A = sc.nextInt();//���� �޾ƿ��� ����
				D = find(goods,B);//�̹� �ִ��� ã�Ƽ� ������ for�� i�� ������ -1 ����
				if(D <0) {//���ٸ� ���Ӱ� �߰�
				goods[C++] = new Goods(B,A); 
				}else {//�ִٸ� �ִ°Ϳ� ���� �߰�
					goods[D].in(A);
				}
				line();
				break;
			case 2 : 
				showInfo(goods);//� ��ǰ�� �ִ��� ���ü��� ���� ���
				System.out.println("��� �� ��ǰ�� �Է��� �ּ���.");
				B = sc.next();//���ڿ�
				System.out.println("��� �� ��ǰ ���� �Է��� �ּ���");
				A = sc.nextInt();//����
				D = find(goods,B);//�̹� �ִ��� ã�Ƽ� ������ for�� i�� ������ -1 ����
				if(D < 0){//���ٸ�
					System.out.println("���� ��ǰ�Դϴ�.");
					break;
				}else {//�ִٸ�
					goods[D].out(A);//A�� ������ ���ϰ� ���� �޼���
				}
				line();
				break;
			
			case 3 : 
				showInfo(goods);//��Ȳ�� �����ִ� �޼���
				line();
				break;
			
			case 4 : 
				System.out.println("�ý����� �����մϴ�.");
				tu = false;//Ż��
				line();
				break;
			
			default:
				System.out.println("��ȣ�� �߸� �����̽��ϴ�.");
			}
		}
	}
	public static int find(Goods[] goods, String good) {//��� ��ġ ã�Ƽ� �ƿ��� �־��ֱ�
		for(int i=0; i < C; i++) {
			if(goods[i].getGoods().equals(good)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void showInfo(Goods[] goods) {
		System.out.println("���� ��� ��Ȳ��");
			for(int i = 0; i < C; i++) {
				System.out.println(goods[i].getGoods()+"�� ���� "+goods[i].getNum()+"�� �Դϴ�.");
			}
	}
	public static void line() {
		System.out.println("====================================================");
	}
}
