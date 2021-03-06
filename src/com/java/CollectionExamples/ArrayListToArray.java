package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
	public static void main(String args[]) {
		List<String> names = new ArrayList<>();
		names.add("suhas");
		names.add("prasad");
		names.add("srinath");
		names.add("abraham");
		
		System.out.println("Iterating an ArrayList");
		for(String name : names) {
			System.out.println(name);
		}
		
		
		System.out.println("");
		System.out.println("Converting ArrayList To Array");
		String[] nameArray =(String[])names.toArray();

		for(String name : nameArray) {
			System.out.println(name);
		}
	}

}
