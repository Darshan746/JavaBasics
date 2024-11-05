package com.java.String;

public class StringRightRotation {
    // Method to perform left rotation
    public static String leftRotation(String str, int rotateFrom) {
        // Using substring to rotate left
        String leftRotatedString = str.substring(rotateFrom) + str.substring(0, rotateFrom);
        return leftRotatedString;
    }

    // Method to perform right rotation
    public static String rightRotation(String str, int rotateFrom) {
        // Calculate the effective rotation for right rotation
        int length = str.length();
        rotateFrom = rotateFrom % length; // Handle cases where rotateFrom is greater than string length
        // Using substring to rotate right
        String rightRotatedString = str.substring(length - rotateFrom) + str.substring(0, length - rotateFrom);
        return rightRotatedString;
    }

    public static void main(String[] args) {
        String str = "darshan";
        System.out.println("original String : "+ str);
        // Left rotation
        System.out.println("Left Rotation: " + leftRotation(str, 2));

        // Right rotation
        System.out.println("Right Rotation: " + rightRotation(str, 2));
    }
}
