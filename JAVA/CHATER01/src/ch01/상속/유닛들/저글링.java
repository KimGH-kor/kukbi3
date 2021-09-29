package ch01.상속.유닛들;

import ch01.상속.유닛타입.지상유닛;

public class 저글링 extends 지상유닛{

	@Override
	public void 공격() {
		super.공격();
		System.out.println("공격속도가 아주 빠릅니다.");
		System.out.println("공격력 : "+공격력);
	}

	@Override
	public void 이동() {
		super.이동();
		스피드 += 5;
		System.out.println("스피드 : "+스피드);
	}

}
