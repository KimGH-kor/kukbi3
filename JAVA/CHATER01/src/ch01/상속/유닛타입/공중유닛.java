package ch01.상속.유닛타입;

public abstract class 공중유닛 extends 유닛상속 {
	protected int 공격력 = 5;
	protected int 스피드 = 10;
	
	@Override
	public void 공격() {
		super.공격();
	}

	@Override
	public void 이동() {
		System.out.println("공중으로 이동합니다.");
		스피드 += 3;
	}

}
