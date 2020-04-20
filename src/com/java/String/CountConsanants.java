package com.java.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Not completed
public class CountConsanants {
    private static final Integer[] nos = {0,1,2,3,4,5,6,7,8,9};
    private static boolean isAllContainDigitFrom0To9(String str) {
        Pattern pattern = Pattern.compile("(\\d*)");
        Matcher matcher =  pattern.matcher(str);

        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            stringBuilder.append(matcher.group());
        }
        List predif = new ArrayList(Arrays.asList(nos));

        return false;
    }

    public static void main(String[] args) {
        isAllContainDigitFrom0To9("darsh678hh8");
    }
}