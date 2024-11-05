package com.java.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumberFromString {

    public static  void extractNo(String str) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }

    public static void main(String[] args) {
        extractNo("Hello123jk78");
    }
}
