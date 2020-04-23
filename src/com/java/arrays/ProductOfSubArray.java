package com.java.arrays;

public class ProductOfSubArray {


    // Function to find product of all subarrays
    static void product_subarrays(int arr[], int n)
    {
        // Variable to store the product
        int product = 1;

        // Compute the product while
        // traversing for subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                product *= arr[j];
            }
        }

        // Printing product of all subarray
        System.out.println(product+"\n");
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 2, 8, 4 };

        int n = arr.length;

        // Function call
        product_subarrays(arr, n);

    }
}
