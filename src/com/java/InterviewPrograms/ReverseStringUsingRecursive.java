package com.java.InterviewPrograms;

public class ReverseStringUsingRecursive {
	
	String reverse = "";
    
    public String reverseString(String str){
         
       if(str.length()==0){
       	return str;
	   }
            reverse += str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    

	
	public static void main(String args[]) {
		
		ReverseStringUsingRecursive a = new ReverseStringUsingRecursive();
		System.out.println(a.reverseString("Dars"));
	}

}
