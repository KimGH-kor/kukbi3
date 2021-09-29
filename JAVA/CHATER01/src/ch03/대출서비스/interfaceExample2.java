package ch03.대출서비스;

import ch03.대출서비스.function.AppCDInfo;
import ch03.대출서비스.function.SeparateVolume;
import ch03.대출서비스.interpace.Lendable;

public class interfaceExample2 {
	public static void main(String[] args) {
		Lendable arr[] = new Lendable[3];
		arr[0] = new SeparateVolume("883d","푸코의 진자","에코");
		arr[1] = new SeparateVolume("609.2d","서양미술사","곰브리치");
		arr[2] = new AppCDInfo("02-17","XML을 위한 자바 프로그래밍");
		checkInAll(arr, "윤지혜", "20060315");
	}
	static void checkInAll(Lendable arr[], String borrower, String date) {
		for(int cnt = 0; cnt < arr.length; cnt++) {
			arr[cnt].checkIn(borrower, date);
		}
	}
}
