package com.java.CollectionExamples;

import java.util.*;

public class TreeMapSortingDescendingOrder {
	public static void main(String args[]) {
		Map<Integer, String> unsortedMap = new HashMap<>();
		unsortedMap.put(1, "Darshan");
		unsortedMap.put(36, "Rudresh");
		unsortedMap.put(23, "Ramesh");
		Map<Integer, String> sortedMap = new TreeMap<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		sortedMap.putAll(unsortedMap);
		System.out.println(sortedMap);
	}
	
	
	
	
	
}

