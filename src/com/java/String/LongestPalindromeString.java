package com.java.String;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeString {

    public List<String> palindromeStrings = new ArrayList<>();
     public static void main(String[] args) {
        LongestPalindromeString pd = new LongestPalindromeString();

        String pal = pd.findLongestPalindrome("akiau");
        System.out.println("" + pal);


       // System.out.println("" + pal);

    }

    public String findLongestPalindrome(String s) {
        // Validations
        if (s.isEmpty()) {
            return "Please enter a String";
        }

        if (s.length() == 1) {
            return null;
        }
        // Validations end

        // Start with one char (starting) as a longest palindrome
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {

            // get longest palindrome for odd length (center is i)
            String tmp = checkForEquality(s, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }

            // get longest palindrome for even length (center is i, i+1)
            tmp = checkForEquality(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }


        return longest;
    }


    /**
     * In this method equality is checked starting from
     * the center moving one character left and one character
     * right from the center. If both chars are equal then the
     * next set of chars are checked.
     *
     */
    public String checkForEquality(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
       return s.substring(begin + 1, end);

    }



}
