package ch04;

import java.util.StringTokenizer;

public class ProgramingL {
	static int count = 0;//�ε���
	public static void main(String[] args) {
		String a = "c++ C++, Java JavA(python)";
		String n = a.toLowerCase();//�ҹ��ڷ�

		
		
		StringTokenizer st = new StringTokenizer(n," ,()?/-");//���ܼ���
		
		program[] arr = new program[10];//Ŭ������ �迭
		
		
		
		
		
		
		
		while(st.hasMoreTokens()) {//�ڸ� ������ŭ ������.
			String str = st.nextToken();//ó���� �޾ƿ���
			add(arr,str);//add�޼��� ����
		}
		
		showInfo(arr, count);
		
		
	}
	
	static void showInfo(program[] arr, int count) {//����ϱ�
		for(int i = 0; i < count; i++) {
			System.out.println(arr[i].name+"  "+arr[i].cnt);
		}
	}
	
	static void add(program[] arr, String str) {//�迭�� ���� ���� �ε��� �޾ƿ�
		int save = -1;//���� �̸��� �ִٸ� ���° ��ġ���� �ľ�
		
		if(count != 0) {//�ε����� 0�̶�� ���� ����
			for(int i = 0; i < count; i++) {//�ε����� ��ŭ ����
					if(arr[i].getName().equals(str)) {//���� ���� �̸��ΰ� �ִٸ� 
						save = i;//��ġ �ľ�
						break;
					}
				}
			}
		
		if(save != -1){//-1�� �ٲ���ٸ�
			arr[save].setCnt(arr[save].getCnt()+1);//�� ��ġ�� �ִ� ���� +1�Ѵ�
		}else {
			arr[count++] = new program(str, 1);//���� �̸��� ���ٸ� �� ��ġ�� ���ο� ��ü ����
		}
	}
	
}
class program{
	String name;
	int cnt;
	
	public program(String name, int cnt) {
		this.name = name;
		this.cnt = cnt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}