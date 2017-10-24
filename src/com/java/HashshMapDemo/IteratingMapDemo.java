package com.java.HashshMapDemo;

import java.util.HashMap;
import java.util.Set;

public class IteratingMapDemo {
	
	public static void main(String args[]){
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("darshan", 27);
		hm.put("rajesh", 28);
		hm.put("", 32);
		
		Set<String> set = hm.keySet();
		
		for(String s : set){
			System.out.println(s);
		}
	}

}
