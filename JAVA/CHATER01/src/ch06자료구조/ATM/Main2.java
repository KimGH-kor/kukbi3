package ch06�ڷᱸ��.ATM;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
	static int C = 0;
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			HashMap<String, Account2> account = new HashMap<String, Account2>();
			
			int A;//ȭ�� 1���� �޾ƿ��� ����
			int A2;//ȭ�� 1���� �޾ƿ��� ����
			String B;// ���� �޾ƿ��� ����
			String B1;// ���� �޾ƿ��� ����
			String B2;// ���� �޾ƿ��� ����
			int D;// ��ġ ã�� ����
			int D1;//�۱� ���� ��ġ ã�� ����
			String E;
			
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
					if(A == -1) {
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
					showInfo(account);//���ü��� ���� ���
					System.out.println("�α��� �� ���¸� ������ �ּ���.");
					B = sc.next();//���ڿ� �޾ƿ��� ����
					D = find(account,B);
					E = B;
					if(D == -1) {
					boolean tu1 = true;
					while(tu1) {
						System.out.println("���� �α��� �� ���´� "+account.get(E).getNo()+"�Դϴ�.");
						System.out.println("1.�Ա� 2.��� 3.�۱� 4.�ܾ� ��ȸ 5.����");
						A = sc.nextInt();
					    switch (A) {
						case 1: {
							System.out.println("�Ա� �� �ݾ��� �Է��� �ּ���");
							A = sc.nextInt();
							account.get(E).deposit(A);
							System.out.println(A+"�� �ݾ��� �Ա� �Ǿ� "+account.get(E).getBal()+"�� �Ǿ����ϴ�.");
							break;
						}
						case 2: {
							System.out.println("��й�ȣ�� �Է��� �ּ���");
							B = sc.next();
							System.out.println("��� �� �ݾ��� �Է��� �ּ���");
							A = sc.nextInt();
							account.get(E).withdraw(A, B);
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
							account.get(E).send(account.get(B), A, B1);
							break;
						}
						case 4: {
							System.out.println("��й�ȣ�� �Է��� �ּ���");
							B = sc.next();
							account.get(E).show(B);
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
		public static int find(HashMap<String, Account2> account, String no) {//��� ��ġ ã�Ƽ� �ƿ��� �־��ֱ�
				if(account.get(no)==null) {
					return 0;
				}
			return -1;
		}
		
		public static void showInfo(HashMap<String, Account2> acc) {
			System.out.println("���� ȸ�� ��Ȳ��");
				for(String word : acc.keySet()) {
					System.out.println(acc.get(word).getName()+" : "+acc.get(word).getNo());
				}
				System.out.println("�Դϴ�.");
		}
		public static void line() {
			System.out.println("====================================================");
		}
}
