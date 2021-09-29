package ch01.상속.유닛들;

import ch01.상속.유닛타입.공중유닛;

public class 뮤탈 extends 공중유닛{

	@Override
	public void 공격() {
		super.공격();
		System.out.println("피해를 3번 입힙니다.");
		공격력 -=2;
		System.out.println("공격력 : "+공격력);
	}

	@Override
	public void 이동() {
		super.이동();
		System.out.println("스피드가 빠릅니다.");
		this.스피드 += 3;
		System.out.println("스피드 : "+스피드);
	}
	
	

}
