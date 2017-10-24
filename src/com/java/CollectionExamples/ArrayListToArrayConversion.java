package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ArrayListToArrayConversion {

	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("C");
		list.add("C++");
		list.add("java");
		
		String[] array = new String[list.size()];
		list.toArray(array);
		//String[] array1 =  (String[]) list.toArray(array);
		for(String s : array) {
			System.out.println(s);
			System.out.println("hello \n");
		}
		
	}
}
