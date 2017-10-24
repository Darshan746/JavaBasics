package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.List;

public class AddAllDemo {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Pearl");
		list.add("c");
		list.add("C++");
		System.out.println("First List Elements");
		System.out.println(list);
		System.out.println("");
		
		List<String> secondList = new ArrayList<>();
		secondList.add("PHP");
		secondList.addAll(list);
		//After adding list to the Second list
		System.out.println(secondList);
	}
	

	

}
