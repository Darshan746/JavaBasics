package com.java.String;

public class PalindromeString {

	public boolean isStringPalindrome(String one) {

		char[] chars = one.toCharArray();
		int i = 0;
		int j = one.length() - 1;
		while (i <= j) {
			if (chars[i] != chars[j]) {
				return false;
			}
			i++;
			j--;
		}

return true;
}

	public static void main(String args[]) {
		PalindromeString p =  new PalindromeString();

		System.out.print(p.isStringPalindrome("PUUP"));
	}
}
