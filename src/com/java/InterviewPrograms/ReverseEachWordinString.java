package com.java.InterviewPrograms;

public class ReverseEachWordinString {
	
	public static void reverseEachWord(String originalWord){
		String[] originalArray = originalWord.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<originalArray.length;i++){
			char charArr[] = originalArray[i].toCharArray(); 
			for(int j=charArr.length-1;j>=0;j--){
				sb.append(charArr[j]);
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}
	
	public static void main(String args[]){
		reverseEachWord("Hello darshan");
	}
	

}
