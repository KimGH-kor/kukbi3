package ch01.���.����Ÿ��;

import ch01.���.�������̽�.����;

public abstract class ���ֻ�� implements ����{
	
	@Override
	public void ����() {
		System.out.println("������ �մϴ�.");
		
	}

	@Override
	public void �̵�() {
		System.out.println("�̵��� �մϴ�.");
		
	}
	
	public void run() {
		this.�̵�();
		this.����();
	}
	
}
