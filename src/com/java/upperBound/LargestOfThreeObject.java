package com.java.upperBound;

public class LargestOfThreeObject {
	
	public static <T extends Comparable<T>> T maximum(T x,T Y,T z){
		T max= x;
		if(Y.compareTo(max)>0){
			max=Y;
		}
		if(z.compareTo(max)>0){
			max = z;
		}
		
		return max;
	}
	
	public static void main(String args[]) {
		
		System.out.println(maximum(3, 5, 8));
	}

}
