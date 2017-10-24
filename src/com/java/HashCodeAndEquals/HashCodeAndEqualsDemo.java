package com.java.HashCodeAndEquals;

import java.util.HashSet;

public class HashCodeAndEqualsDemo {
	private String name;
	
	private String country;
	
	private int age;
	
	
	public HashCodeAndEqualsDemo(String name,String country,int age) {
		this.name = name;
		this.country = country;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		HashCodeAndEqualsDemo demo = (HashCodeAndEqualsDemo)obj;
		if(this.country == demo.country) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		int hash=3;
		hash = 2*this.country.hashCode();
		return hash;
	}
	
	public static void main(String args[]) {
		HashCodeAndEqualsDemo d = new HashCodeAndEqualsDemo("darshan", "India", 23);
		HashCodeAndEqualsDemo e = new HashCodeAndEqualsDemo("Ramesh", "India", 23);
		HashCodeAndEqualsDemo f= new HashCodeAndEqualsDemo("hemanat", "Nepal", 29);
		HashSet<HashCodeAndEqualsDemo> g = new HashSet<>();
		g.add(d);
		g.add(e);
		g.add(f);
		
		for(HashCodeAndEqualsDemo a : g){
			System.out.println(a.age );
		}
		System.out.println(d.equals(e));
		System.out.println(e.equals(f));
		System.out.println(d.country.hashCode());
	}

}
