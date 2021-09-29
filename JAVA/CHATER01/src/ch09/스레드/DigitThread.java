package ch09.½º·¹µå;

public class DigitThread extends Thread {
	public void run() {
		for(int ont = 0; ont < 10; ont++) {
			System.out.print(ont);
		}
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			
		}
	}
}
