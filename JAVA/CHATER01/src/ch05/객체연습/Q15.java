package ch05.°´Ã¼¿¬½À;

public class Q15 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("I Love You");
		char tem;
		
		for(int i = 0; i < sb.length()+1; i++) {
			System.out.println(sb);
			tem = sb.charAt(0);
			sb.deleteCharAt(0);
			sb.append(tem);
		}
	}
}
