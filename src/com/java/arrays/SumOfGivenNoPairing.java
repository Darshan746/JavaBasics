package com.java.arrays;

// Write a java program to find all pairs of elements in an integer array whose sum is equal to a given number?
public class SumOfGivenNoPairing {

  public static  void printPairsEqualSum(int[] array, int givenSum){
    for(int i=0;i<=array.length-1;i++){
      for(int j=i+1;j<array.length-1;j++){
        if(array[i]+array[j]== givenSum) {
          System.out.println(array[i]+" "+"+"+array[j]);
        }
      }
    }
  }

  public static void main(String[] args) {

    int[] array = {12, 23, 125, 41, -75, 38, 27, 1};
    printPairsEqualSum(array, 50);
  }
}
