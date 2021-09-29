package ch03.대출서비스;

import ch03.대출서비스.function.AppCDInfo;
import ch03.대출서비스.function.SeparateVolume;

public class interfaceExample1 {
	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume("1", "개미", "김영숙");
		AppCDInfo obj2 = new AppCDInfo("2", "페도라");
		obj1.checkIn("김영숙", "20060315");
		obj2.checkIn("박희경", "20060317");
		obj1.checkOut();
		obj2.checkOut();
	}
}
