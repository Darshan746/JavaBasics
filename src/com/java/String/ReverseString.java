package com.java.String;

public class ReverseString {
	public static void main(String arags[]){

		String originalString = "Darshan";
		
		char[] charArray = originalString.toCharArray();
		for(int i=charArray.length-1;i>=0;i--){
			System.out.print(charArray[i]);
		}
	}
}
