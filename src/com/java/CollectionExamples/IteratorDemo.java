package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("unix");
		list.add("java");
		list.add("C#");
		
		//Iterate the collection Object Using Iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
