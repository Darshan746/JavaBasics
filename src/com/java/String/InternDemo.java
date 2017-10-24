package com.java.String;

public class InternDemo {
	
	public static void main(String args[]){
		String s = new String("darshan");
		
		String s2= "darshan";
		
		String s3=s.intern();
		
		if(s2==s3){
			System.out.println("Refere to the same");
		}
	}

}
