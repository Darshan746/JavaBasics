package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.List;

public class ContainsAllMethodDemo {

	public static void main(String args[]) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList.add("four");
		
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		//list.add("four");
		//list.add("random");
		
		
		System.out.println("Does arrayList contains all the element of list ");
		System.out.println(arrayList.containsAll(list));
	}
}
