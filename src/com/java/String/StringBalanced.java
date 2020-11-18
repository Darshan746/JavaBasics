package com.java.String;

import java.util.Stack;

//How to check if a String is balanced Expression
public class StringBalanced {

    /**
     * Push Any open Parantheses to the stack and if any closed symbols comes then
     * pop the stack and compare the result if they are not same then the string is not balanced
     * @param str
     * @return
     */
    public static boolean isStringBalanced(String str) {
    Stack<Character> st = new Stack();
    for(char chr : str.toCharArray())
    {


        switch(chr) {
            case '{':
            case '(':
            case '[':
                st.push(chr);
                break;

            case ']':
                if( st.pop() != '[')
                    return false;
                break;
            case ')':
                if( st.pop() != '(')
                    return false;
                break;
            case '}':
                if( st.pop() != '{')
                    return false;
                break;
        }
    }
    return st.isEmpty();
}


    public static void main(String[] args) {
String str  = "{([a+b]+(a+C))}";
        System.out.println(isStringBalanced(str));
    }


}


