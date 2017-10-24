package com.java.instancedemo;

public class Dog extends Animal {
	
	/*@Override
	public void sleep(){
		System.out.println("Dog is Sleeping");
	}*/
	
	public static void main(String args[]) {
		Animal a = new Dog();
		if(a instanceof Dog){
			System.out.println("a is an instance of Dog");
		}
		if(a instanceof Animal){
			System.out.println("a is an instance of Animal");
		}
		
		
		
	}

}
