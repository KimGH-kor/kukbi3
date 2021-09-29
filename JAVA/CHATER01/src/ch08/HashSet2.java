package ch08;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		System.out.println("저장된 데이터의 수 = "+set.size());
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String a = iter.next();
			System.out.println(a);
		}
	}
}
