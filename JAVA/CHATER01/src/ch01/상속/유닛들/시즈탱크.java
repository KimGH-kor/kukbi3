package ch01.���.���ֵ�;

import ch01.���.����Ÿ��.��������;

public class ������ũ extends ��������{
	boolean mode = false;
	
	public void setmode() {
		if(mode == true) {
			mode = false;
		}else {
			mode = true;
		}
	}
	
	@Override
	public void ����() {
		super.����();
		if(mode == true) {
			this.���ݷ� +=5;
		}else {
			���ݷ� = 15;
		}
		System.out.println("���ݷ� : "+���ݷ�);
	}

	@Override
	public void �̵�() {
		if(mode == true) {
			this.���ǵ� = 0;
			System.out.println("���缭�� �����մϴ�.");
		}else {
			���ǵ� = 10;
			System.out.println("�̵� �մϴ�.");
		}
		
		System.out.println("���ǵ� : "+���ǵ�);
	}
}
