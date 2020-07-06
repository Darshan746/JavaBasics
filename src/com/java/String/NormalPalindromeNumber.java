package com.java.String;

public class NormalPalindromeNumber {
	
	public static void main(String args[]) {
		
		int number=393;
		
		int palindrome = number;
		
		int reverse=0;
		
		while(number!=0) {
			int reminder = number%10;
			reverse = (reverse*10)+reminder;
			number= number/10;
		}
		
		
		if(palindrome == reverse) {
			System.out.println("Its a palindrome");
		}else 
		{
			System.out.println("its not a palindrome");
		}
	}

}
