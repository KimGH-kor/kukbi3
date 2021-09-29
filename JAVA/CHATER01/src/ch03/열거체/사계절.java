package ch03.열거체;

enum Season{
	SPRING, SUMMER, FALL, WINTER
}

public class 사계절 {
	public static void main(String[] args) {
		ClothingInfo obj = new ClothingInfo("82919", "반팔 티셔츠", "면 100%", Season.SUMMER);
		System.out.println("상품 코드 "+obj.code);
		System.out.println("상품명 "+obj.name);
		System.out.println("소재 "+obj.matetial);
		System.out.println("계절부문 "+obj.season);
	}
}
class ClothingInfo {
	String code;
	String name;
	String matetial;
	Season season;
	public ClothingInfo(String code, String name, String matetial, Season season) {
		this.code = code;
		this.name = name;
		this.matetial = matetial;
		this.season = season;
	}
}