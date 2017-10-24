package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateEliminationInList {
public static void main(String args[]) {
	List<String> list = new ArrayList<>();
	list.add("Java");
	list.add("Pearl");
	list.add("c");
	list.add("c");
	System.out.println("Before eliminatig the duplicate");
	for(String s : list) {
		System.out.println(s);
	}
	
	System.out.println("After eliminating the duplicate");
	Set<String> s = new HashSet<>(list);
	list = new ArrayList<>(s);
	for(String s1 : list) {
		System.out.println(s1);
	}
}

}
