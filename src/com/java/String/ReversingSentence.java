package com.java.String;

public class ReversingSentence {
	
	
	
	/*public static void reverse (String str){
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
*/

	public static String reverseWord(String sentence) {
		String word[] = sentence.split(" ");
		String reverseSentence = " ";

		for(int i=0;i<=word.length-1; i++){
			String wordN = word[i];
			for(int j=wordN.length()-1;j>=0;j--){
				reverseSentence +=wordN.charAt(j);
			}
		}
		return reverseSentence;
	}

	public static void main(String[] args) {
		System.out.print(reverseWord("hello"));
	}
}