package com.java.Generics;

public class GenericMethodDemo {
	
	public  <T> void add(T a){
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		GenericMethodDemo d = new GenericMethodDemo();
		d.add(2);
		d.add("darshan");
	}

}
