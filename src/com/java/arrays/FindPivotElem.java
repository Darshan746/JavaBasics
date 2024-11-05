package com.java.arrays;

/**
 * Given an integer array return pivot index
 * pivot index is such that the sum of the elements on the left is equal to sum of the element on the right
 */
public class FindPivotElem {

    public static int getPivotElementIndex(int[] arr) {
        int rightSum = 0;
        for (int i : arr) {
            rightSum += i;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,8,4,1};
        System.out.println(getPivotElementIndex(arr));
    }

}
