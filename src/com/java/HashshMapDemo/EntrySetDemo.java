package com.java.HashshMapDemo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetDemo {
	
	public static void main(String args[]){
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("darshan", 27);
		hm.put("rajesh", 28);
		hm.put("", 32);
		
		//getting KeySet
		Set<String> set = hm.keySet();
		
		//getting entrySet
		
		Set<Entry<String, Integer>> s1 = hm.entrySet();
		
		
		for(Entry<String, Integer> s : s1){
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}
}
