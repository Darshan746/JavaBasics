package com.java.String;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindPalindromeInSubString {

    private static List<String> getPalindromeString(String string) {

        List<String> stringList =  new ArrayList<>();
        for(int i = 0; i< string.length()-1; i++){
            for(int j=i+1;j<=string.length()-1;j++){
                stringList.add(string.substring(i,j));
            }
        }

      List<String> palindromeString = new ArrayList<>();

       for(int i=0; i<stringList.size(); i++){
           String one = stringList.get(i);
           String two="";
           for(int j=one.length()-1; j>=0; j--) {
               two += one.charAt(j);
           }
           if(one.equalsIgnoreCase(two) ){
               palindromeString.add(stringList.get(i));
           }
        }

    Predicate<String> p = (t)->{
                                char[] chars = t.toCharArray();
                                    int i=0, j=chars.length-1;
                                    while(i<=j){
                                            if(chars[i]!=chars[j]){
                                                 return false;
                                            }
                                            i++;j--;
                                    }
                                 return true;
                               };


      palindromeString = stringList.stream().filter(str->p.test(str)).collect(Collectors.toList());
        return palindromeString;
    }

    public static void main(String[] args) {
        List<String> palindromicSubStrings  = getPalindromeString("abcbcggg");
        String longestSubString = "";
        int max = 0;
      for(String str: palindromicSubStrings) {
          if(str.length() > max) {
              longestSubString = str;
              max = str.length();
          }
      }
        System.out.println(longestSubString);


    }
}
