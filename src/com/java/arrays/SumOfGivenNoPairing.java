package com.java.arrays;

import java.util.Arrays;

// Write a java program to find all pairs of elements in an integer array whose sum is equal to a given number?
public class SumOfGivenNoPairing {

  public static  void printPairsEqualSum(int[] array, int givenSum){
    int low = 0;
    int high = array.length-1;

    while(low<high){

      if(array[low]+array[high]==givenSum) {
        System.out.println(array[low]+" "+array[high]);
      }
      if(array[low]+array[high]>givenSum){
        high--;
      }else {
        low++;
      }
    }
  }

  public static void main(String[] args) {
    int[] array = {12, 23, 125, 41, -75, 38, 27, 1};
    Arrays.sort(array);
    printPairsEqualSum(array, 50);
  }
}
