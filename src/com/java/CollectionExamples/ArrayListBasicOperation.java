package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasicOperation {
	
	public static void main(String args[]) {
		
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Pearl");
		list.add("c");
		list.add("C++");
		
		System.out.println("List Before any operation \n");
		System.out.println(list+"\n");
		System.out.println("Add the element to particular index \n");
		list.add(4, "PHP");
		System.out.println("After adding the element to particular index \n");
		System.out.println(list+"\n");
		
		//Contains Demo
		
		System.out.println("Searching the element in the collection \n");
		System.out.println(list.contains("Java"));
		System.out.println(list.contains("D"+"\n"));
		
		
	}

}
