package com.java.InterviewPrograms;

import java.util.Arrays;

public class BubbleSortDemo {
	
	public int[] sortAsscending(int[] numberList) {
		
		int i,j,temp=0;
		for( i=0;i<numberList.length;i++){
			for(j=0;j<numberList.length-i-1;j++){
				if(numberList[j]>numberList[j+1])
				{
					temp = numberList[j];
					numberList[j]=numberList[j+1];
					numberList[j+1]=temp;		
				}
		}
		
	}
		System.out.println("After Sorting"+" "+Arrays.toString(numberList));
		return numberList;
	}

		public static void main(String args[]){
			BubbleSortDemo demo = new BubbleSortDemo();
			int[] numberList = {9,3,1,2,8};
			System.out.println("Original List"+" "+Arrays.toString(numberList));
			demo.sortAsscending(numberList);
		}
		
	}

