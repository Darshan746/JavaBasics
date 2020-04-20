package com.java.String;

import java.util.stream.Stream;

public class StringRotation {


    public static boolean  isStringRotation(String originalString, String rotationalString) {
        if(originalString.length()==rotationalString.length()) {
            String newString = originalString+originalString;
            if(newString.contains(rotationalString)) {
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        System.out.println(isStringRotation("Darshan", "arshDan"));
    }
}
