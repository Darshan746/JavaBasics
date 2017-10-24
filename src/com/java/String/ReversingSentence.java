package com.java.String;

public class ReversingSentence {
	
	
	
	public static void reverse (String str){
		String[] words = str.split(" ");
		
		String reverseString ="";
		
		for(int i=0;i<words.length;i++){
			String word = words[i];
			String reverseWord ="";
			for(int j=word.length()-1;j>=0;j--){
				reverseWord+=word.charAt(j);
			}
			reverseString = reverseString+reverseWord+" ";
		}
		System.out.println(str);
		System.out.println(reverseString);
	}
	
	public static void main(String args[]) {
		reverse("darshan hello how are you");
	}
}
