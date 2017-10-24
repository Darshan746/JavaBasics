package com.java.Comparator;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Country> {

	@Override
	public int compare(Country o1, Country o2) {
		
		String name1 = o1.getName();
		String name2 = o2.getName();
		if(name1.compareTo(name2) < name2.compareTo(name1)){
			return -1;
		}
		if(name1.compareTo(name2) > name2.compareToIgnoreCase(name1)){
			return 11;
		}
	/*	if(o1.getId() <o2.getId()) {
			return -1;
			}if(o1.getId() > o2.getId()) {
				return 1;
			}*/
		return 0;
	}

}
