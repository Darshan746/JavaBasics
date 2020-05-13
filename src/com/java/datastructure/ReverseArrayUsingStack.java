package com.java.datastructure;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {

    public static void reverseArrayUsingStack(int[] array) {

        Stack<Integer> stack = new Stack();
        int i =0;
        while (i<=array.length-1){
            stack.push(array[i]);
            i++;
        }
        int j =0;
        while (!stack.isEmpty()) {
            array[j] = stack.pop();
            j++;
        }
        System.out.println("After reversing");
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverseArrayUsingStack(array);
    }

}
