package ch08;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<String, Integer> hashtable = new HashMap<>();
		hashtable.put("�ظ�", new Integer(95));
		hashtable.put("�츣�̿´�", new Integer(100));
		hashtable.put("��", new Integer(85));
		hashtable.put("�巹����", new Integer(93));
		hashtable.put("�׺�", new Integer(70));
		
		Integer num = hashtable.get("�츣�̿´�");
		System.out.println("�츣�̿´��� ������? "+num);
		
	}
}
