package com.java.String;

public class factorialUsingRecursion {
	static int output ;
	public static int calculatefactorial(int num) {
		if(num == 1){
			return 1;
		}
		return  calculatefactorial(num-1)*num;
	}
	
	public static void main(String args[]) {
		System.out.println(calculatefactorial(4));
	}
	
	
	
}
