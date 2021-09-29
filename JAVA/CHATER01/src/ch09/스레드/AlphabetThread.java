package ch09.½º·¹µå;

public class AlphabetThread extends Thread{
	public void run(){
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
			
			}
	}
	}
}
