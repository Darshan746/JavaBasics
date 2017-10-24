package com.java.CollectionExamples;

import java.util.HashSet;

import javax.swing.text.rtf.RTFEditorKit;

public class HashCodeAndEqualsDemo {
	public String name;
	public String color;
	
	public HashCodeAndEqualsDemo(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object ob) {
		if(this == ob) {
			return true;
		}
		HashCodeAndEqualsDemo obj = (HashCodeAndEqualsDemo)ob;
		if(this.color == obj.color) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash =1;
		hash = 3*color.hashCode();
		return hash;
	}
	
	public static void main(String args[]) {
		
		HashCodeAndEqualsDemo a = new HashCodeAndEqualsDemo("Darshan", "White");
		HashCodeAndEqualsDemo b = new HashCodeAndEqualsDemo("Raman", "Red");
		HashCodeAndEqualsDemo c = new HashCodeAndEqualsDemo("Raman", "White");
		System.out.println(a.equals(c));
		
		HashSet<HashCodeAndEqualsDemo> set = new HashSet<>();
		set.add(a);
		set.add(b);
		set.add(c);
		
		
		for(HashCodeAndEqualsDemo d : set) {
			System.out.println(d.getName());
		}
		System.out.println(set.contains(new HashCodeAndEqualsDemo("Darshan", "White")));
		
	}

}
