package ch03.����ü;

enum Season{
	SPRING, SUMMER, FALL, WINTER
}

public class ����� {
	public static void main(String[] args) {
		ClothingInfo obj = new ClothingInfo("82919", "���� Ƽ����", "�� 100%", Season.SUMMER);
		System.out.println("��ǰ �ڵ� "+obj.code);
		System.out.println("��ǰ�� "+obj.name);
		System.out.println("���� "+obj.matetial);
		System.out.println("�����ι� "+obj.season);
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