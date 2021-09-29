package ch01.상속.유닛타입;

import ch01.상속.인터페이스.유닛;

public abstract class 유닛상속 implements 유닛{
	
	@Override
	public void 공격() {
		System.out.println("공격을 합니다.");
		
	}

	@Override
	public void 이동() {
		System.out.println("이동을 합니다.");
		
	}
	
	public void run() {
		this.이동();
		this.공격();
	}
	
}
