package com.java.String;

public class PalindromeString {

	public void palindromeCheck(String palindrome) {

		String Original = palindrome;
		String reverseString = "";
		char[] charArray = Original.toCharArray();
		
		for(int i =charArray.length-1;i>=0;--i){
			reverseString+=charArray[i];
		}

		if(Original.equals(reverseString)){
			System.out.println("the given String  "+palindrome+" "+"is palindrome");

		}
		else{
			System.out.println("Given String"+""+palindrome+" "+"is not a palindrome");
		}
	}

	public static void main(String args[]) {
		PalindromeString p =  new PalindromeString();
		p.palindromeCheck("PUPp");
	}
}
