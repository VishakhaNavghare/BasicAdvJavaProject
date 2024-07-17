package com.tka.controller;

import java.util.ArrayList;

import com.tka.service.ElectionService;

public class ElectionController {
	
	public ArrayList<String> giveCandidatesStates(){
		ElectionService es = new ElectionService();
		ArrayList<String> al = es.giveCandidatesStates();
		return al;
		
	}
	

}
