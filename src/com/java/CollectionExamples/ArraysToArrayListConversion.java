package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysToArrayListConversion {
	public static void main(String args[]) {
		
		String[] names = {"darshan","hemanth","ramesh"};
		
		System.out.println("Converting an Array into ArrayList");
		List<String> nameList = Arrays.asList(names);
		System.out.println("Iterating List Element");
		for(String s : nameList) {
			System.out.println(s);
		}
		
		
		System.out.println("");
		nameList.set(1, "rahul");
		System.out.println("After set the element");
		for(String s : nameList) {
			System.out.println(s);
		}
		
		
		System.out.println("");
		System.out.println("Iterating an Array");
		for(String s :names) {
			System.out.println(s);
		}
		 
		// Here we cannot add the element to Arralist that we obtained from Array , If we add the Element then throws an exception
		nameList.add("Gandhari");
		
	}

}
