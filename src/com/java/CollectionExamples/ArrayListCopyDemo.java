package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

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
		
		ArrayList<String> copiedList = (ArrayList<String>)list;//.clone();
		copiedList.add("dw");
		System.out.println("After copying into anotherlist");
		System.out.println(copiedList);


		CopyOnWriteArrayList<String> cowalStars =
				new CopyOnWriteArrayList<>();

		// adding elements to CopyOnWriteArrayList
		cowalStars.add("Super Star");
		cowalStars.add("Ultimate Star");
		cowalStars.add("Rock Star");
		cowalStars.add("Little Star");

		System.out.println("Iterating using enhanced for-loop:\n");

		// iterating CopyOnWriteArrayList using enhanced for-loop
		for(String star : cowalStars) {
			System.out.println(star);
		}
		System.out.println("\n1st: Iteration of COWAL "
				+ "completed... !!\n\n");

		System.out.println("\n\n2nd: Iterating & removing:\n");

		// iterating CopyOnWriteArrayList using Iterator
		Iterator<String> itr = cowalStars.iterator();
		while(itr.hasNext()){

			String star = itr.next();

			if(star.contains("Super")){
				itr.remove();
			}
			else{
				System.out.println(star);
			}
		}

}
	}
