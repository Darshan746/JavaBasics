package com.java.ComparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Country implements Comparable<Country> {
	
	protected int id;
	protected String name;

	public Country(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Country o) {
	
		/*if(this.name.compareTo(o.name) < o.name.compareTo(this.name)){
			return -1;
		}
		if(this.name.compareTo(o.name) > o.name.compareTo(this.name)){
			return 1;
		}else 
		return 0;*/
		
		if(this.id <o.id){
			return -1;
		}
		else
			return 1;
	}
	
	public static void main(String args[]) {
		Country a = new Country(1, "India");
		Country b = new Country(3, "Japan");
		Country c = new Country(4, "Russia");
		Country d = new Country(2,"USA");
		
		List<Country> set = new ArrayList<>();
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		
		System.out.println("Before sorting");
		for(Country country :set) {
			System.out.println(country.id+" "+country.name);
		}
		
		Collections.sort(set);
		
		System.out.println("After Sorting");
		for(Country country :set) {
			System.out.println(country.id+" "+country.name);
		}
		
		
	}
	

}
