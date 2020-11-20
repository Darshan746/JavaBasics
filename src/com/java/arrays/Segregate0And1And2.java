package com.java.arrays;

import java.util.Arrays;

public class Segregate0And1And2 {

    public static void segregateArray(int[] array) {
        int low = 0;
        int mid = 0;
        int high = array.length-1;

        // here mid will traverse each and every ele
        while (mid<=high){

            switch (array[mid]) {
                case 0:
                    swap(array, low, mid);
                    low++; mid++;
                    break;
                case 1: mid++;
                    break;
                case 2: swap(array, mid, high);
                    high--;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int ele1, int elem2) {
        int temp = array[ele1];
        array[ele1] = array[elem2];
        array[elem2] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1,2,0,1,0,2};
        segregateArray(array);
    }
}
