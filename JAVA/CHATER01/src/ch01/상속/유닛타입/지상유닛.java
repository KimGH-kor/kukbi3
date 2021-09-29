package ch01.상속.유닛타입;

public abstract class 지상유닛 extends 유닛상속{
	protected int 공격력 = 5;
	protected int 스피드 = 8;
	
	@Override
	public void 공격() {
		super.공격();
	}

	@Override
	public void 이동() {
		super.이동();
	}
	
	
}
