package com.java.Collection.ComparatorDemo;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary() > e2.getSalary()){
			return-1;
		}else 
			
		return 1;
	}

}
