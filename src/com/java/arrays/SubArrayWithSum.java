package com.java.arrays;

import java.util.HashMap;
import java.util.Map;

/*
public class SubArrayWithGivenSum {
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
        int start = 0;
        int end = 0;
        while (end < array.length) {
            if (currSum == givenSum) {
                printArray(array, start, end);
            }

            if (currSum <= givenSum) {
                end++;
                if (end < array.length)
                    currSum += array[end];
            } else {
                currSum -= array[start];
                start++;
            }
        }
    }


    public static void main(String[] args) {
        int array[] = {4, 2, 1, 6, 1, 5, 2};
        int sum = 7;
        printSubArraySecondSol(array, 7);
    }


}
*/
