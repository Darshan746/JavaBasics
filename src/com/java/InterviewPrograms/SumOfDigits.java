package com.java.InterviewPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SumOfDigits {
	
	public static void sumOfDigits(int digits) throws IOException{

		int a=0,sum=0,i;
		while(digits!=0) {
			a=digits%10;
			digits=digits/10;
			sum=sum+a;
		}
		
	}
	public static void main(String args[]) throws IOException{
		sumOfDigits(321);
	}

}
