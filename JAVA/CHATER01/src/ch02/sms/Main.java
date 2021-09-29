package ch02.sms;

public class Main {
	public static void main(String[] args) {
		MessageSender ss = new SMSSender("안녕","김경환","010-0000-0000","오랜만이네?");
		ss.sendMessage("010-1111-1111");
	}
}
