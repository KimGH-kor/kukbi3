package ch02.sms;

public class Main {
	public static void main(String[] args) {
		MessageSender ss = new SMSSender("�ȳ�","���ȯ","010-0000-0000","�������̳�?");
		ss.sendMessage("010-1111-1111");
	}
}
