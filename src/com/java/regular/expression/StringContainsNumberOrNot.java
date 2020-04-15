package com.java.regular.expression;

import java.util.regex.Pattern;

public class StringContainsNumberOrNot {

    public static void isStrContainsNumber(String str) {

        boolean pattern = Pattern.matches(".*\\d.*", str);

        System.out.println("this  is "+pattern);
    }

    public static void main(String[] args) {
        isStrContainsNumber("kkk99888k");

    }
}
