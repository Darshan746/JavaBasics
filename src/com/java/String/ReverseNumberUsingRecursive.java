package com.java.String;

public class ReverseNumberUsingRecursive {
	
	public static void reverseNumber(int num) {
		/*if(num<10) {
			System.out.println(num);
			return;
		} else {
			System.out.print(num%10);
			reverseNumber(num/10);
		}*/
		int sum =0;
		while (num>0) {
			int rem = num%10;
			sum = (sum*10)+rem;
			num= num/10;
		}
		System.out.println("Reversed Num is "+sum);
	}

	public static void main(String args[]) {
		reverseNumber(123498);
	}
}