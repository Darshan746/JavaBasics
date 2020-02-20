package com.java.Collection.ComparatorDemo;

import java.util.Objects;

public class Employee {
	
	public String name;
	public int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
	public boolean equals(Object w){
	    Employee e = (Employee)w;
	    return this.name.equals(((Employee) w).name);
    }
}
