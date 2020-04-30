package com.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class ProductOfSubArray {

    static List<Integer> integerList = new ArrayList<>();
    static void printSubArrays(int []arr, int start, int end) {
        // Stop if we have reached the end of the array
        if (end == arr.length) {
            int product =1 ;

            for (Integer intVal : integerList) {
                product*=intVal;
            }
            System.out.println("Product Is");
            System.out.println(product);
            return;
        }


            // Increment the end point and start from 0
        else if (start > end)
            printSubArrays(arr, 0, end + 1);

            // Print the subarray and increment the starting point
        else
        {
            System.out.print("[");
            for (int i = start; i < end; i++){
                integerList.add(arr[i]);
                System.out.print(arr[i]+", ");
            }
            System.out.println(arr[end]+"]");
            integerList.add(arr[end]);
            printSubArrays(arr, start + 1, end);
        }

        return;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        printSubArrays(array, 0, 0);
    }
}
