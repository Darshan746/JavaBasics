package com.java.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSum {

  private static void printSubArray(int[] array, int givenSum) {

    for(int i=0; i<array.length; i++){

      int sum_so_far = 0;

      for(int j=i; j<array.length; j++){

        sum_so_far+=array[j];
        if(sum_so_far == givenSum) {
          printArray(array, i, j);
        }
        if(sum_so_far>givenSum){
          break;
        }
      }
    }
  }

  public static void printArray(int[] array, int startRange, int endRange) {

    for (int i = startRange; i <= endRange; i++) {
      System.out.print(array[i] + " " + " ");
    }
    System.out.println();
  }

  public static void printSubArraySecondSol(int[] array, int givenSum) {
//    int totalSum = 0;
//    int end =0;
//    Map<Integer, Integer> map = new HashMap<>();
//
//    while (end<array.length){
//      totalSum +=array[end];
//
//      int sum  = totalSum-givenSum;
//      if(map.containsKey(sum)){
//        int start = map.get(sum);
//        printArray(array, start+1, end);
//      }else{
//        map.put(totalSum, end++);
//      }
//    }
    int currSum = array[0];
    int start=0;
     int end=0;
    while (end < array.length)
    {
      if (currSum == givenSum)
      {
        printArray(array,start,end);
      }

      if (currSum <= givenSum)
      {
        end++;
        if (end < array.length)
          currSum += array[end];
      }
      else
      {
        currSum = currSum - array[start];
        start++;
      }
    }
  }




  public static void main(String[] args) {
  int array[] = {4,2,1,6,1,5,2};
  int sum =7;
  //printSubArray(array, sum);
    printSubArraySecondSol(array, 7);

//  int[] a = {1,2,3,4};
// // System.out.println(a);
//int index=1;
//
//  for(int i =index;i<=a.length-2;i++){
//    a[i]=a[i+1];
//  }
//
//    for(int i =0;i<=a.length-2;i++){
//      //System.out.print(a.length);
//    }


  }




}
