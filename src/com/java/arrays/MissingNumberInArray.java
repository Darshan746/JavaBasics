package com.java.arrays;

import java.util.Arrays;

//Write a java program to find a missing number in an integer array?
public class MissingNumberInArray {

  private static int sumOfEleTillGivenNum( int num){

    int sum = (num*(num+1))/2;
    return  sum;
  }

  private static int addElementsFromArray(int[] arr){
    int sum =0;
    for(int i=0;i<=arr.length-1;i++){
        sum= sum+arr[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int n = 8;

    int[] a = {1,4, 5, 3, 2, 8, 6};

    int sumOfNnumbers = sumOfEleTillGivenNum(n);

    int sumOfElements = addElementsFromArray(a);

      int missingNumber = sumOfNnumbers - sumOfElements;

    System.out.println("Input Array : "+ Arrays.toString(a));

    System.out.println("Missing Number is = "+missingNumber);
  }

}
