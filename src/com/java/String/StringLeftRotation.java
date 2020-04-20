package com.java.String;

public class StringLeftRotation {
    public static String leftRotation(String str, int rotateFrom) {
        String leftRotatedString = str.substring(rotateFrom).concat(str.substring(0,rotateFrom));
        return leftRotatedString;
    }

    public static void main(String[] args) {
        System.out.println( leftRotation("darshan",2));
        System.out.println("For right rotate "+ " "+leftRotation("darshan", "darshan".length()-2));
    }
}
