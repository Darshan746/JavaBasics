package com.java.String;

public class factorialUsingRecursion {

	public static int calculatefactorial(int num) {
		if(num == 1){
			return 1;
		}
		int output ;
		output = calculatefactorial(num-1)*num;
		return output;
	}
	
	public static void main(String args[]) {
		System.out.println(calculatefactorial(4));
	}
	
	
	
}
