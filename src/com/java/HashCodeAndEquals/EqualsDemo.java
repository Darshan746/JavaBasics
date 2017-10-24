package com.java.HashCodeAndEquals;

public class EqualsDemo {

	public String name;

	public EqualsDemo(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		EqualsDemo d = (EqualsDemo)obj;
		if(this.name==d.name) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		EqualsDemo d = new EqualsDemo("darshan");
		EqualsDemo e = new EqualsDemo("darshan");;
		System.out.println("both are equal"+" "+d.equals(e));
		
		System.out.println(d.name.hashCode());
		System.out.println(e.name.hashCode());
		
		
	}
}
