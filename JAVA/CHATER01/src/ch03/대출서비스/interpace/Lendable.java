package ch03.대출서비스.interpace;

public interface Lendable {
	abstract void checkIn(String borrower, String date);
	abstract void checkOut();
}
