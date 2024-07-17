package com.tka.client;

import java.util.ArrayList;

import com.tka.controller.ElectionController;

public class ElectionClient {

	public static void main(String[] args) {
		
		ElectionController ec = new ElectionController();
		ArrayList<String> listStates = ec.giveCandidatesStates();
		
		for(String stateName : listStates) {
			System.out.println("StateName >> "+stateName);
		}

	}

}
