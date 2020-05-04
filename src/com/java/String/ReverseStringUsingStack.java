package com.java.String;

import java.util.Stack;

/**
 * 1) Create an empty stack.
 * 2) One by one push all characters of string to stack.
 * 3) One by one pop all characters from stack and put
 *    them back to string
 */
public class ReverseStringUsingStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        String str = "Hello";
        char[] chars = str.toCharArray();
        for(int i=0;i<=chars.length-1;i++) {
            stack.push(chars[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<=chars.length-1; i++) {
            stringBuilder.append(stack.pop());
        }
        System.out.println(stringBuilder.toString());
    }
}
