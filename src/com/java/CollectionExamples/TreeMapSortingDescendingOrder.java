package com.java.CollectionExamples;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSortingDescendingOrder {
	
	//Integer Sort
	
	/*public static  void printMap(Map<Integer, String> map){
		Set<Entry<Integer, String>> set = map.entrySet();
		for(Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	
	public static void main(String args[]) {
		Map<Integer, String> unsortedMap = new TreeMap<>();
		unsortedMap.put(7, "darshan");
		unsortedMap.put(99, "rAMESH");
		unsortedMap.put(87, "Suresh");
		System.out.println("Unsorted Map");
		
		System.out.println(unsortedMap);
		
		Map<Integer, String> sortedMap = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2.compareTo(o1);
			}
			
		  });
		sortedMap.putAll(unsortedMap);
		printMap(sortedMap);
		
		
	}
	*/
	
	
	/*
	//String Sort
	public static  void printMap(Map<String, String> map){
		Set<Entry<String, String>> set = map.entrySet();
		for(Entry<String, String> entry : set) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	
	public static void main(String args[]) {
		Map<String, String> unsortedMap = new TreeMap<>();
		unsortedMap.put("Darshan", "Darshan");
		unsortedMap.put("Ramesh", "Ramesh");
		unsortedMap.put("Hemanth", "Hemanth");
		
		
		Map<String, String> sortedMap = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.compareTo(o2) > o2.compareTo(o1)){
					return -1;
				}
				return 1 ;
			}
	
			
		  });
		
		sortedMap.putAll(unsortedMap);
		System.out.println(unsortedMap);
		System.out.println(sortedMap);
		//printMap(sortedMap);
	
		
	}	*/
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		Map<Integer, String> unsortedMap = new LinkedHashMap<>();
		unsortedMap.put(1, "Darshan");
		unsortedMap.put(36, "Rudresh");
		unsortedMap.put(23, "Ramesh");
		Map<Integer, String> sortedMap = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1<o2) {
					return 1;
				}
				else if(o1>o2){
					return -1;
				}
				return 0;
			}
		});
		
		sortedMap.putAll(unsortedMap);
		System.out.println(sortedMap);
	}
	
	
	
	
	
}

