package ch08;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("����������");
		set.add("�ڹ�");
		System.out.println("����� �������� �� = "+set.size());
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String a = iter.next();
			System.out.println(a);
		}
	}
}
