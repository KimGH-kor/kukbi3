package ch03.���⼭��;

import ch03.���⼭��.function.AppCDInfo;
import ch03.���⼭��.function.SeparateVolume;
import ch03.���⼭��.interpace.Lendable;

public class interfaceExample2 {
	public static void main(String[] args) {
		Lendable arr[] = new Lendable[3];
		arr[0] = new SeparateVolume("883d","Ǫ���� ����","����");
		arr[1] = new SeparateVolume("609.2d","����̼���","���긮ġ");
		arr[2] = new AppCDInfo("02-17","XML�� ���� �ڹ� ���α׷���");
		checkInAll(arr, "������", "20060315");
	}
	static void checkInAll(Lendable arr[], String borrower, String date) {
		for(int cnt = 0; cnt < arr.length; cnt++) {
			arr[cnt].checkIn(borrower, date);
		}
	}
}
