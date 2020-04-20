package com.java.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContainsNumberOrNot {

    public static void isStrContainsNumber(String str) {

        boolean pattern = Pattern.matches(".*\\d+.*", str);

        System.out.println("this  is "+pattern);

    }

    public static void main(String[] args) {
        //isStrContainsNumber("kkk99k");
extractNumbers("9887654328");

    }

    public static void extractNumbers(String str) {
        Pattern pattern = Pattern.compile("[7-9]{1}[0-9]{9}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
                System.out.print(matcher.group());
        }
    }
}
