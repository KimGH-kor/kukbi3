package ch01.ATM;

import java.util.Scanner;



public class Main {
	static int C = 0;
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Account[] account = new Account[100];
			int A;//ȭ�� 1���� �޾ƿ��� ����
			int A2;//ȭ�� 1���� �޾ƿ��� ����
			String B;// ���� �޾ƿ��� ����
			String B1;// ���� �޾ƿ��� ����
			String B2;// ���� �޾ƿ��� ����
			int D;// ��ġ ã�� ����
			int D1;//�۱� ���� ��ġ ã�� ����
			
			boolean tu = true;//�ݺ��� Ż��
			
			while(tu) {
				System.out.println("1.ȸ����� 2.ȸ������ 3.ī��ֱ� 4.����");
				A = sc.nextInt();
				line();
				switch (A) {
				case 1 :

					System.out.println("�̸��� �Է��� �ּ���");
					B = sc.next();//���ڿ� �޾ƿ��� ����
					System.out.println("���¹�ȣ�� �Է��� �ּ��� ex)1234-1234");
					B1 = sc.next();
					A = find(account,B1);
					if(A != -1) {
						System.out.println("�ߺ��� �����Դϴ�.");
					}else {
					if(B1.length() > 9 && B1.charAt(4) != '-') {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						break;
					}
					System.out.println("�н����� 4�ڸ��� �Է��� �ּ���");
						B2 = sc.next();
						if(B2.length() >4) {
							System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						}
					System.out.println("ó�� �Ա� �Ͻ� �ݾ��� �Է����ּ���");
					A = sc.nextInt();//���� �޾ƿ��� ����
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
					showInfo(account);//���ü��� ���� ���
					System.out.println("�α��� �� ���¸� ������ �ּ���.");
					B = sc.next();//���ڿ� �޾ƿ��� ����
					D = find(account,B);
					if(D >= 0) {
					boolean tu1 = true;
					while(tu1) {
						System.out.println("���� �α��� �� ���´� "+account[D].getNo()+"�Դϴ�.");
						System.out.println("1.�Ա� 2.��� 3.�۱� 4.�ܾ� ��ȸ 5.����");
						A = sc.nextInt();
					    switch (A) {
						case 1: {
							System.out.println("�Ա� �� �ݾ��� �Է��� �ּ���");
							A = sc.nextInt();
							account[D].deposit(A);
							System.out.println(A+"�� �ݾ��� �Ա� �Ǿ� "+account[D].getBal()+"�� �Ǿ����ϴ�.");
							break;
						}
						case 2: {
							System.out.println("��й�ȣ�� �Է��� �ּ���");
							B = sc.next();
							System.out.println("��� �� �ݾ��� �Է��� �ּ���");
							A = sc.nextInt();
							account[D].withdraw(A, B);
							break;
						}
						case 3: {
							System.out.println("�۱� �� ���¹�ȣ�� �Է��� �ּ���");
							B = sc.next();
							System.out.println("���� ������ ��й�ȣ�� �Է��� �ּ���");
							B1 = sc.next();
							System.out.println("�۱� �� �ݾ��� �Է��� �ּ���");
							A = sc.nextInt();
							D1 = find(account,B);
							account[D].send(account[D1], A, B1);
							break;
						}
						case 4: {
							System.out.println("��й�ȣ�� �Է��� �ּ���");
							B = sc.next();
							account[D].show(B);
							break;
						}
						case 5: {
							tu1 = false;
							break;
						}
						default:
							System.out.println("��ȣ�� �߸� �����̽��ϴ�.");
						}
						
					}
					break;
					}else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						break;
					}
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
		public static int find(Account[] account, String no) {//��� ��ġ ã�Ƽ� �ƿ��� �־��ֱ�
			for(int i=0; i < C; i++) {
				if(account[i].getNo().equals(no)) {
					return i;
				}
			}
			return -1;
		}
		
		public static void showInfo(Account[] account) {
			System.out.println("���� ȸ�� ��Ȳ��");
				for(int i = 0; i < C; i++) {
					System.out.println(account[i].getName()+": "+account[i].getNo()+"�Դϴ�.");
				}
		}
		public static void line() {
			System.out.println("====================================================");
		}
}
