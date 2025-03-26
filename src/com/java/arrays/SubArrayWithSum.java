package com.java.arrays;

import java.util.*;

public class SubArrayWithSum {
    public static void findSubarray(int[] arr, int targetSum) {
        int left = 0, currSum = 0;

        for (int right = 0; right < arr.length; right++) {
            // Expand window: Add current element to currSum
            currSum += arr[right];

            // Shrink window from the left if sum exceeds target
            while (currSum > targetSum && left <= right) {
                currSum -= arr[left];
                left++;
            }

            // Check if we found the subarray
            if (currSum == targetSum) {
                System.out.println("Subarray found from index " + left + " to " + right);
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[i] + " ");
                }
                return;
            }
        }

        System.out.println("No subarray found with sum " + targetSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int targetSum = 12;
        findSubarray(arr, targetSum);
    }
}
