package com.java.LowerBoundDemo;

import java.util.ArrayList;
import java.util.List;

public class GrandChild extends ChildClass {
	
	public static void main(String args[]){
	List<GrandChild> grandChild = new ArrayList<>();
	grandChild.add(new GrandChild());
	addGrandChildrens(grandChild);
	
	
	List<ChildClass> childClass = new ArrayList<>();
	childClass.add(new ChildClass());
	addGrandChildrens(childClass);
	
	
	List<SuperClass> superClass = new ArrayList<>();
	superClass.add(new SuperClass());
	addGrandChildrens(superClass);
	
	}
	
	public static void addGrandChildrens(List<? super GrandChild> grandChilds){
		grandChilds.add(new GrandChild());
		System.out.println(grandChilds);
	}
	

}
