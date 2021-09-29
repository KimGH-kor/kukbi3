package ch01.╩С╪с.test;

import ch01.╩С╪с.ю╞╢ж╣И.╧бе╩;
import ch01.╩С╪с.ю╞╢ж╣И.╫цаНейе╘;
import ch01.╩С╪с.ю╞╢ж╣И.юЗ╠ш╦╣;
import ch01.╩С╪с.юнемфДюл╫╨.ю╞╢ж;

public class Main {
	public static void main(String[] args) {
		ю╞╢ж ╧бе╩1 = new ╧бе╩();
		ю╞╢ж ╧бе╩2 = new ╧бе╩();
		ю╞╢ж ╧бе╩3 = new ╧бе╩();
		ю╞╢ж ╧бе╩4 = new ╧бе╩();
		╫цаНейе╘ ╫цаНейе╘1 = new ╫цаНейе╘();
		ю╞╢ж юЗ╠ш╦╣1 = new юЗ╠ш╦╣();
		
		System.out.println("╧бе╩2");
		╧бе╩2.run();
		System.out.println("╧бе╩1");
		╧бе╩1.run();
		line();
		System.out.println("╫цаНейе╘");
		╫цаНейе╘1.run();
		System.out.println("╫цаН╦П╣Е╦╕ гу╢о╢ы.");
		╫цаНейе╘1.setmode();
		╫цаНейе╘1.run();
		line();
		юЗ╠ш╦╣1.run();
	}
	public static void line() {
		System.out.println("=============================================");
	}
}
