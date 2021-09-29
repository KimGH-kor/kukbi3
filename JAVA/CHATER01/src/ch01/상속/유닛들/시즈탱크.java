package ch01.상속.유닛들;

import ch01.상속.유닛타입.지상유닛;

public class 시즈탱크 extends 지상유닛{
	boolean mode = false;
	
	public void setmode() {
		if(mode == true) {
			mode = false;
		}else {
			mode = true;
		}
	}
	
	@Override
	public void 공격() {
		super.공격();
		if(mode == true) {
			this.공격력 +=5;
		}else {
			공격력 = 15;
		}
		System.out.println("공격력 : "+공격력);
	}

	@Override
	public void 이동() {
		if(mode == true) {
			this.스피드 = 0;
			System.out.println("멈춰서서 공격합니다.");
		}else {
			스피드 = 10;
			System.out.println("이동 합니다.");
		}
		
		System.out.println("스피드 : "+스피드);
	}
}
