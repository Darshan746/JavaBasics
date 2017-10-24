package com.java.InterviewPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TwoArrayUnCommonNumberPrinting {
	
	
	public static void main(String args[]) {
		
	    Integer a[] = {1,2,3,4,5};
		Integer b[] = {3,2,1,0,6};
		Map<Integer, Integer> mapA = new HashMap<>();
		Map<Integer, Integer> mapB = new HashMap<>();
		Map<Integer, Integer> mapUnique = new HashMap<>();
		
		for(int arrayA:a){
			mapA.put(arrayA, arrayA);
		}
		for(int arrayB:b){
			mapB.put(arrayB, arrayB);
		}
		for(int i=0;i<mapA.size();i++){
			if(!mapA.containsKey(b[i])){
				mapUnique.put(b[i], b[i]);
			}
		}
		
		for(int i=0;i<mapB.size();i++){
			if(!mapB.containsKey(a[i])){
				mapUnique.put(a[i], a[i]);
			}
		}
		
		
		
		for(Entry e : mapUnique.entrySet()) {
			System.out.println(e.getKey());
		}
	}

}
