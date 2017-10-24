package com.java.String;

public class ReverseNumberUsingRecursive {
	
	public static void reverseNumber(int num) {
		if(num<10) {
			System.out.println(num);
			return;
		} else {
			System.out.print(num%10);
			reverseNumber(num/10);
		}
	}

	
	public static void main(String args[]) {
		reverseNumber(321);
	}
}