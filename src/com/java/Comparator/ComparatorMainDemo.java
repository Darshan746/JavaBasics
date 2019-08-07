package com.java.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorMainDemo {
	
	public static void main(String args[]) {
		Country a = new Country(1, "India");
		Country b = new Country(2, "Arab");
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
	// First Way
	/*Collections.sort(list,new ComparatorImpl());
	for(Country country : list) {
		System.out.println(country.getId()+" "+country.getName());
	}*/
System.out.println("\n");
	//Lambda ways
	/*List<Country> w = list.stream().sorted((o1,o2)->o1.getId()-o2.getId()).collect(Collectors.toList());
		for(Country country : w) {
			System.out.println(country.getId()+" "+country.getName());
		}*/


	list.sort(Comparator.comparing(Country::getId).thenComparing(Country::getName));
	for(Country country : list) {
		System.out.println(country.getId()+" "+country.getName());
	}
	}




}
