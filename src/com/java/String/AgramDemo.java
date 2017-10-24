package com.java.String;

import java.util.Arrays;

public class AgramDemo {


	public static  boolean isAgram(String s1, String s2) {

		char[] str1 = s1.toLowerCase().toCharArray();
		char[] str2 = s2.toLowerCase().toCharArray();

		Arrays.sort(str1);
		Arrays.sort(str2);

		if(Arrays.equals(str1, str2)){
			return true;
		}
		return false;
	}

	public static void main(String args[]){
		System.out.println(isAgram("darhan", "adsrahn"));
	}

}
