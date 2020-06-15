package com.java.String;


import java.util.ArrayList;
import java.util.List;

/**
 * Count substrings with same first and last characters
 * We are given a string S, we need to find count of all contiguous substrings starting and ending with same character.
 *
 * Examples :
 *
 * Input  : S = "abcab"
 * Output : 7
 * There are 15 substrings of "abcab"
 * a, ab, abc, abca, abcab, b, bc, bca
 * bcab, c, ca, cab, a, ab, b
 * Out of the above substrings, there
 * are 7 substrings : a, abca, b, bcab,
 * c, a and b.
 *
 * Input  : S = "aba"
 * Output : 4
 * The substrings are a, b, a and aba
 */

public class CountSubStrWithSameFirstAndLastLetter {


    public static int getSubStrCountWithSameFirstAndLast(String str)  {
        List<String> strings = new ArrayList<>();
        List<String> filteredString = new ArrayList<>();
        if(str.length()==0 || str.isEmpty()){
            throw new RuntimeException("Please give the proper input");
        }
        else {
            //finding the SubString
            for(int i=0;i<=str.length()-1; i++) {
                for(int j=i+1; j<=str.length();j++) {
                    strings.add(str.substring(i, j));
                }
            }
            for(String filtered: strings) {
                if(filtered.charAt(0)==filtered.charAt(filtered.length()-1)) {
                    filteredString.add(filtered);
                }
            }
        }
        System.out.println("length is "+strings.size());
                return filteredString.size();
                }

    public static void main(String[] args) {
        System.out.println(getSubStrCountWithSameFirstAndLast("abc"));
        }

}
