package com.java.String;

public class ReverseStringrecursively {
	
	public String recursive(String word) throws Exception{
		if(word.length()<=1){
			return word;
		}
		return recursive(word.substring(1))+word.charAt(0);
	}
	
	public static void main(String rags[]) throws Exception {
		ReverseStringrecursively a = new ReverseStringrecursively();
		System.out.println(a.recursive("darshan"));
	}
}