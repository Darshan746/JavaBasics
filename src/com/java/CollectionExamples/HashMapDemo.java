package com.java.CollectionExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Set;

public class HashMapDemo {
	
	public static void main(String args[]) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Darshan");
		map.put(2,"Raman");
		map.put(3, "Girish");
		//Set set = ;
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry m = (Map.Entry)it.next();	
			System.out.println(m.getKey()+" "+" "+"value is"+" "+m.getValue());
		}

	
	}

}
