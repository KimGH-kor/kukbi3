package ch03.���⼭��;

import ch03.���⼭��.function.AppCDInfo;
import ch03.���⼭��.function.SeparateVolume;

public class interfaceExample1 {
	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume("1", "����", "�迵��");
		AppCDInfo obj2 = new AppCDInfo("2", "�䵵��");
		obj1.checkIn("�迵��", "20060315");
		obj2.checkIn("�����", "20060317");
		obj1.checkOut();
		obj2.checkOut();
	}
}
