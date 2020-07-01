package com.java.String;

import java.util.Stack;

//How to check if a String is balanced Expression
public class StringBalanced {

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
                if(st.isEmpty() || st.pop() != '[')
                    return false;
                break;
            case ')':
                if(st.isEmpty() || st.pop() != '(')
                    return false;
                break;
            case '}':
                if(st.isEmpty() || st.pop() != '{')
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


