package com.java.String;



public class TwoWordReverse {
    private static String reverseTwoChars(String str) {
        char[] characters =  str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0 ; i<characters.length-1 ;i++){
            int next = i+1;
            stringBuilder.append(characters[next]).append(characters[i]);
            i = ++i+1;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println( reverseTwoChars("Dar"));
    }
}
