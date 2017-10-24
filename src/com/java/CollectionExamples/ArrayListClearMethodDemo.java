package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClearMethodDemo {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Pearl");
		list.add("c");
		list.add("C++");
		
		System.out.println("Before Deleting the List");
		System.out.println(list);
		
		System.out.println("");
		
		System.out.println("After deleting the list objects");
		list.clear();
		System.out.println(list);
	}
	

	

}
