package com.java.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMainDemo {
	
	public static void main(String args[]) {
		Country a = new Country(1, "India");
		Country b = new Country(3, "Japan");
		Country c = new Country(4, "Russia");
		Country d = new Country(2,"USA");
		
		List<Country> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		System.out.println(list);
	for(Country country : list) {
		System.out.println(country.getId()+" "+country.getName());
	}
	
	Collections.sort(list,new ComparatorImpl());
	for(Country country : list) {
		System.out.println(country.getId()+" "+country.getName());
	}
	}
}
