package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String args[]){
		List<String> list = new ArrayList<>();
		list.add("Guru");
		list.add("Gowri");
		list.add("navya");
		
		ListIterator<String> lt = list.listIterator();
		System.out.println("Iterating Object in Forward direction");
		System.out.println("");
		//Iterating in the forward direction
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		
		System.out.println("");
		System.out.println("Iterating Object in Reverse direction");
		System.out.println("");
		//Iterating in the reverse direction Of the List
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
	}
}
