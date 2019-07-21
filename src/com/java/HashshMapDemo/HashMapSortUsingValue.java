package com.java.HashshMapDemo;

import java.util.*;
import java.util.Map.Entry;

public class HashMapSortUsingValue {

	/*private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap) {

		//Converting Map to List
		List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if(o1.getValue() < o2.getValue()) {
					return  -1;
				}
				return 1;
			}
		});

		// Convert sorted map back to a Map
		Map<String, Integer> sortedMap = new LinkedHashMap<>();

		for(Entry<String, Integer> i : list){
			sortedMap.put(i.getKey(),i.getValue());
		}
		return sortedMap;
	}


	public static void printMap(HashMap<String, Integer> sortedMap) {
		for(Entry<String, Integer> s:sortedMap.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}

	public static void main(String args[]) {
		Map<String, Integer> unsortedMap = new TreeMap<>();
		unsortedMap.put("Darshan", 1);
		unsortedMap.put("Ramesh", 2);
		unsortedMap.put("Hemanth", 3);

		System.out.println(unsortedMap);
		Map<String, Integer> sortedMap = HashMapSortUsingValue.sortByComparator(unsortedMap);
		HashMapSortUsingValue.printMap((HashMap<String, Integer>) sortedMap);
	}*/
	
	public static Map<String, Integer> comparatorMethod(Map<String, Integer> unsortedmap) {
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(unsortedmap.entrySet());
		
		Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return  o1.getValue()-o2.getValue() ;
			}
		});

		
		for(Map.Entry<String, Integer> entry :list){
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		return unsortedmap;
	}
	
	
	
	
	public static void main(String args[]) {
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("Darshan", 1);
		unsortedMap.put("Ramesh", 2);
		unsortedMap.put("Hemanth", 0);
		
		HashMapSortUsingValue.comparatorMethod(unsortedMap);
	}
	
	
	

}
