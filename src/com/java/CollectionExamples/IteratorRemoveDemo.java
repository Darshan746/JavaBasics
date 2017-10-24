package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveDemo {
	public static void main(String args[]) {
		
		List<String> list = new ArrayList<>();
		list.add("unix");
		list.add("java");
		list.add("C#");
		String remove = "unix";
		
		System.out.println("Before removing the Element from collection");
		System.out.println(list);
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			if(remove.equals(it.next())){
				it.remove();
			}
		}
		System.out.println("After removing the Element from list");
		System.out.println(list);
		
	}

}
