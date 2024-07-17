package com.collectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListTest {

	public static void main(String[] args) {
		
	ArrayList<Integer> rr = new ArrayList<>();
	rr.add(13);
	rr.add(9);
	rr.add(3);
	System.out.println(rr);
	
	ArrayList<Integer> kkr = new ArrayList<>();
	kkr.add(10);
	kkr.add(7);
	kkr.add(3);
	System.out.println(kkr);
	
	ArrayList<Integer> srh = new ArrayList<>();
	srh.add(8);
	srh.add(5);
	srh.add(3);
	System.out.println(srh);
	
	ArrayList<Integer> rcb = new ArrayList<>();
	rcb.add(7);
	rcb.add(4);
	rcb.add(3);
	System.out.println(rcb);
	
	HashMap<String, ArrayList<Integer>> pointTable = new HashMap<String, ArrayList<Integer>>();
	
	pointTable.put("RR",rr);
	pointTable.put("KKR",kkr);
	pointTable.put("SRH",srh);
	pointTable.put("RCB",rcb);
	System.out.println(pointTable);
	System.out.println("----------------------------");
	
	Set<String> keys = pointTable.keySet();
	
	for(String key : keys) {
		System.out.println("key >> "+ key);
		ArrayList<Integer> value = pointTable.get(key);
		for(Integer v1 : value) {
			System.out.println(v1);
		}
	}
	System.out.println("----------------------------");
	
	ArrayList<HashMap<String, ArrayList<Integer>>> a1 = new ArrayList<HashMap<String, ArrayList<Integer>>>();
	a1.add(pointTable);
    System.out.println(a1);
	

	}

}
