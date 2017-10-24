package com.java.Generics;

public class GenericMethodDemo {
	
	public static <T> void add(T a){
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		
		add(2);
		add("darshan");
	}

}
