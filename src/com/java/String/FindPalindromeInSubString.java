package com.java.String;

import java.util.ArrayList;
import java.util.List;

public class FindPalindromeInSubString {

    private static List<String> getPalindromeString(String string) {
        List<String> stringList =  new ArrayList<>();
        for(int i = 0; i< string.length()-1; i++){
            for(int j=i+1;j<=string.length()-1;j++){
                stringList.add(string.substring(i,j));
            }
        }
        List<String> palindromeString = new ArrayList<>();
        for(int i=0; i<=stringList.size()-1; i++){
           String one = stringList.get(i);
           String two="";
           for(int j=one.length()-1; j>=0; j--) {
               two += one.charAt(j);
           }
           if(one.equalsIgnoreCase(two) ){
               palindromeString.add(stringList.get(i));
           }
        }
        return palindromeString;
    }

    public static void main(String[] args) {
        System.out.println(getPalindromeString("abcbcg"));
    }
}
