package com.java.Collection.ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyArrayListSort {
	
	public static void main(String args[]) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("darshan", 200000));
		list.add(new Employee("Raman", 100000));
		System.out.println("Before sorting");

		for(Employee e : list) {
			System.out.println(e.getSalary());
		}
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return 0;
			}
		});

		System.out.println("After Sorting");

		for(Employee e : list) {
			System.out.println(e.getSalary());
		}
	}

}
