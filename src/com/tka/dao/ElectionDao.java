package com.tka.dao;

import java.util.ArrayList;

public class ElectionDao {
	
	public ArrayList<String> giveCandidatesStates(){
		ArrayList<String> al = new ArrayList<>();
		al.add("MH");
		al.add("UP");
		al.add("MP");
		return al;
	}

}
