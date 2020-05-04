package com.java.datastructure;

import java.util.Arrays;

public class Mergesort {
    public static void mergesort(int[] input)
    {
        mergeSort(input, 0, input.length - 1);
    }

    public static void main(String[] args) {
        System.out.println("mergesort");

        int[] input = {87, 57, 370, 110, 90, 610};
        System.out.println("array before sorting");
        System.out.println(Arrays.toString(input));

        // sorting array using MergeSort algorithm
        System.out.println("array after sorting using mergesort algorithm");
        mergesort(input);
        System.out.println(Arrays.toString(input));


    }
    private static void mergeSort(int[] input, int start, int end) {
    // break problem into smaller structurally identical problems
        int mid = (start + end) / 2;
        if (start < end)
        {
            mergeSort(input, start, mid);
            mergeSort(input, mid + 1, end);
        }
        int i = 0;
        int first = start;
        int last = mid + 1;
        int[] tmp = new int[end - start + 1];

        while (first <= mid && last <= end) {
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }
        while (first <= mid) {
            tmp[i++] = input[first++];
        }
        while (last <= end) {
            tmp[i++] = input[last++];
        }
        i = 0;
        while (start <= end){
            input[start++] = tmp[i++];
        }
    }
}