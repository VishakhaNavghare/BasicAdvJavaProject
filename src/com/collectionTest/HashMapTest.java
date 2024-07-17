package com.collectionTest;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("RR", "fff1");
		hm.put("BB", "fff2");
		hm.put("CC", "fff3");

		Set<String> keys = hm.keySet();
		
		for(String key : keys) {
			System.out.println("Key -- " +key);
			String val = hm.get(key);
			System.out.println("Val -- " +val);
		}
	}

}
