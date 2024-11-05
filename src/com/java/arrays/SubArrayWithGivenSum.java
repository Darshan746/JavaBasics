package com.java.arrays;

public class SubArrayWithGivenSum {

    public static void printArray(int[] array, int startRange, int endRange) {
        for (int i = startRange; i <= endRange; i++) {
            System.out.print(array[i] + " " + " ");
        }
        System.out.println();
    }

    public static void printSubArraySecondSol(int[] array, int givenSum) {
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
        //printSubArray(array, sum);
        printSubArraySecondSol(array, 7);
    }
}
