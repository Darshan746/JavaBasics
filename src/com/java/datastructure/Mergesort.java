package com.java.datastructure;

import java.util.Arrays;

/**
 *
 *
 */
public class Mergesort {

    public static void mergeSort(int[] arr, int numberOfElements) {
        if (numberOfElements < 2) {
            return;
        }

        int mid = numberOfElements / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[numberOfElements - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = arr[i];
        }

        for (int i = mid; i < numberOfElements; i++) {
            rightArray[i - mid] = arr[i];
        }

        mergeSort(leftArray, mid);
        mergeSort(rightArray, numberOfElements - mid);
        merge(arr, leftArray, rightArray, mid, numberOfElements - mid);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
        int i = 0, j = 0, k = 0;

        // Merge the two subarrays into arr[]
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements of leftArr[]
        while (i < left) {
            arr[k++] = leftArr[i++];
        }

        // Copy remaining elements of rightArr[]
        while (j < right) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 4, 3, 0};
        mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr)); // Use Arrays.toString() to print array contents
    }
}
