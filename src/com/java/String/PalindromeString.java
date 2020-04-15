package com.java.String;

public class PalindromeString {

	public void palindromeCheck(String palindrome) {

		/*String Original = palindrome;
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
	}*/

	}


	public boolean isStringPalindrome(String one){

		String two = "";

		for(int i =one.length()-1; i>=0; i--){
			two+=one.charAt(i);
		}

		if(one.toLowerCase().equals(two.toLowerCase())){
			return true;
		}
		else
			return false;
	}

	public static void main(String args[]) {
		PalindromeString p =  new PalindromeString();

		System.out.print(p.isStringPalindrome("PUUP"));
	}
}
