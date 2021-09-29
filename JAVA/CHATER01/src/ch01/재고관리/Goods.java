package ch01.재고관리;

public class Goods {
	private String goods;
	private int num;
	
	Goods(String goods, int num){
		this.goods = goods;
		this.num = num;
	}

	public void in(int in) {//있는 상품이 들어올때
		num += in;
		System.out.println("이미 있는 상품에 "+ in +"개를 추가하여"+ num +"개가 되었습니다.");
	}
	
	public void out(int num) {//출고 goods
		if(this.num < num) {//갯수가 들어온거 보다 적다면
			System.out.println("재고가 부족합니다.");
		}else {
			this.num -= num;
			System.out.println(goods+"가 "+num+"남았습니다.");
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
