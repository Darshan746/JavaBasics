package com.java.arrays;

public class SearchElemInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        System.out.println(searchElemInRotatedArray(arr, 4));
    }

    public static int searchElemInRotatedArray(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == array[mid]) {
                return mid;
            }
            if (array[start] <= array[mid]) {
                if (target >= array[start] && target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target >= array[mid] && target < array[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
