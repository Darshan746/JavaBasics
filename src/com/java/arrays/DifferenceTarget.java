package com.java.arrays;

import java.util.Arrays;

/**
 * You are given an array of unique integers and a target value.
 * You need to find out the number of pairs that can be formed from the elements of the array such that their difference is the target value
 * This Solution has time complexity nlogn
 * logn for binarySearch
 */
public class DifferenceTarget {

    public static boolean binarySearch(int[] arr, int numberToBeSearched) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == numberToBeSearched) {
                return true;
            }
            if (arr[mid] < numberToBeSearched) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return false;
    }

    public static int getNoOfDiffPair(int[] arr, int diffValue) {
        int count = 0;
        Arrays.sort(arr);
        int numberToSearch;
        for (int i : arr) {
            numberToSearch = i - diffValue;
            if (binarySearch(arr, numberToSearch)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 9, 2, 3, 4};
        System.out.println(getNoOfDiffPair(arr, 7));
    }
}



