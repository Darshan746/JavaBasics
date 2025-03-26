package com.java.arrays;

import java.util.Stack;
import java.util.Arrays;

public class nextGreaterElement {

    public static int[] findNGE(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];  // Result array
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Remove smaller elements from stack
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            // If stack is empty, no NGE found
            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            // Push current element into stack
            stack.push(arr[i]);
        }

        return nge;
    }


    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25, 7, 8, 6, 3};
        int[] nge = findNGE(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Element: " + Arrays.toString(nge));
    }
}

