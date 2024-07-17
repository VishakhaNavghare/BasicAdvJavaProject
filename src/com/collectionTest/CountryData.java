package com.collectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CountryData {

	public static void main(String[] args) {
		
		ArrayList<String> alMH = new ArrayList<String>();
		alMH.add("Nagpur");
		alMH.add("Pune");
		alMH.add("Mumbai");
		
		ArrayList<String> alUP = new ArrayList<String>();
		alUP.add("Noida");
		alUP.add("Lucknow");
		
		ArrayList<String> alDL = new ArrayList<String>();
		
		HashMap<String, ArrayList<String>> hmState = new HashMap<String, ArrayList<String>>();
		hmState.put("MH", alMH);
		hmState.put("UP", alUP);
		hmState.put("DL", alDL);
		
		HashMap<String, HashMap<String, ArrayList<String>>> hmPuraIndia = new HashMap<String, HashMap<String, ArrayList<String>>>();
		hmPuraIndia.put("India", hmState);
		System.out.println(hmPuraIndia);
		
		
	// Optional - isase naukri lagegi	
		
		Set<String> cNameSet = hmPuraIndia.keySet();
		
		for(String cname : cNameSet) {
			HashMap<String, ArrayList<String>> hmstatehm = hmPuraIndia.get(cname);
			Set<String> stateNameState = hmstatehm.keySet();
			
			for(String stateName : stateNameState) {
				ArrayList<String> distNameList = hmstatehm.get(stateName);
				
				for(String distName : distNameList) {
					System.out.println("Dist Name >> "+ distName);
				}
			}
			
		}
	}

}
