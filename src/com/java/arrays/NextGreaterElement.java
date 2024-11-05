package com.java.arrays;

import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement {

    public static int[] findNGE(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n]; // Array to store the NGE of each element
        Arrays.fill(nge, -1);   // Initialize all NGEs as -1
        Stack<Integer> stack = new Stack<>();
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Maintain elements in decreasing order in the stack
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            // If the stack is not empty, the top element is the NGE for arr[i]
            if (!stack.isEmpty()) {
                nge[i] = stack.peek();
            }
            // Push the current element to stack for the next iteration
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
