package com.java.HashshMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SingleKeyMultipleValuesDemo {
	
	public static void main(String args[]) {
		
		HashMap<String, List<String>> map = new HashMap<>();
	
		List<String> a = new ArrayList<>();
		a.add("Apple");
		a.add("Aeroplane");
		
		List<String> b = new ArrayList<>();
		b.add("Ball");
		b.add("Bengaluru");
		
		List<String> c = new ArrayList<>();
		c.add("Cat");
		c.add("Can");
		
		map.put("A", a);
		map.put("b", b);
		map.put("C", c);
		
		
		//Iterating over For each loop
		System.out.println("iterating over for each loop");
		for(Entry<String,List<String>> g: map.entrySet()){
			System.out.println(g.getKey()+"======> "+g.getValue());
		}
		
		
		//Iterating over map using Iterator;
		
		System.out.println("Iterating over Iterator");
		Set<Entry<String, List<String>>> set =  map.entrySet();
		
		Iterator<Entry<String, List<String>>> it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, List<String>> entry = it.next();
			System.out.println(entry.getKey()+"======> "+entry.getValue());
		}
		
		
		
		
		
		/*
		//Iterating through Iterator
		Set<Entry<String, List<String>>> setMap = map.entrySet();
		
			        // Get an iterator
		
			        Iterator<Entry<String,  List<String>>> iteratorMap = setMap.iterator();
		
			        // display all the elements

			        while(iteratorMap.hasNext()) {
	
			            Map.Entry<String, List<String>> entry =
	
			                    (Map.Entry<String, List<String>>) iteratorMap.next();
			            String key = entry.getKey();
	
			            List<String> values = entry.getValue();
	
			            System.out.println("Key = '" + key + "' has values: " + values);
	
			        }
		
		
	}
*/
}
}
