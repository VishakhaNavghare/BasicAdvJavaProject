package com.tka.service;

import java.util.ArrayList;

import com.tka.dao.ElectionDao;

public class ElectionService {

	public ArrayList<String> giveCandidatesStates(){
		ElectionDao ed = new ElectionDao();
		ArrayList<String> al = ed.giveCandidatesStates();
		return al;
	}
}
