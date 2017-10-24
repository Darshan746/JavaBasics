package com.java.CollectionExamples;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String args[]){
		Vector<String> vector = new Vector<>();
		vector.add("Darshan");
		vector.add("Dhanush");
		vector.add("Dhananjay");

		//creating Enumeration object using Vector object
		Enumeration<String> enumeration = vector.elements();

		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println(string);

		}
	}
}
