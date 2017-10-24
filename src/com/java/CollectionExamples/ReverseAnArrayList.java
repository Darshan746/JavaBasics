package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAnArrayList {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("C");
		list.add("C++");
		list.add("java");
		System.out.println("Before reversing an element");
		System.out.println(list);
		System.out.println("");
		Collections.reverse(list);
		System.out.println("After reversing an element");
		System.out.println(list);
		
	}

}
