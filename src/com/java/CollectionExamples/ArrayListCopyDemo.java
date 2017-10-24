package com.java.CollectionExamples;

import java.util.ArrayList;

public class ArrayListCopyDemo {
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Pearl");
		list.add("c");
		list.add("C++");
		
		System.out.println("before Copying into another arrayList");
		System.out.println(list);
		System.out.println("");
		
		ArrayList<String> copiedList = (ArrayList<String>)list.clone();
		System.out.println("After copying into anotherlist");
		System.out.println(copiedList);
		
		
	}
}
