package com.java.InterviewPrograms;
 class EvenOrAddWithoutModulous {
	 
	 public static void printEvenOrOdd(int num){
		 
		 if((num/2)*2==num){
			 System.out.println("Given Number is Even");
			 
		 }else{
			 System.out.println("Given Number Is Odd");
		 }
	 }
	 
	 public static void main(String[] args) {
		printEvenOrOdd(23);
	}
	
}