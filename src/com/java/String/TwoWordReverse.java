package com.java.String;

public class TwoWordReverse {
    private static void reverseTwoChars(String str) {
        char[] characters = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < characters.length - 1; i = i + 2) {
            System.out.print(characters[i + 1]);
            System.out.print(characters[i]);
        }if(characters.length%2!=0) {
            System.out.print(characters[characters.length-1]);
        }
    }

    public static void main(String[] args) {
       reverseTwoChars("Darshan");
    }
}