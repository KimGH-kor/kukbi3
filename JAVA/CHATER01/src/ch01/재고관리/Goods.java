package ch01.������;

public class Goods {
	private String goods;
	private int num;
	
	Goods(String goods, int num){
		this.goods = goods;
		this.num = num;
	}

	public void in(int in) {//�ִ� ��ǰ�� ���ö�
		num += in;
		System.out.println("�̹� �ִ� ��ǰ�� "+ in +"���� �߰��Ͽ�"+ num +"���� �Ǿ����ϴ�.");
	}
	
	public void out(int num) {//��� goods
		if(this.num < num) {//������ ���°� ���� ���ٸ�
			System.out.println("��� �����մϴ�.");
		}else {
			this.num -= num;
			System.out.println(goods+"�� "+num+"���ҽ��ϴ�.");
		}
		
	}
	
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
