package com.java.instancedemo;

public class Animal {
	
	public int id=20;
	public String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Integer a = new Integer(2);
	int j = a.intValue();
	
	
	public void sleep() {
		System.out.println("Animal is Sleeping");
	}

}
