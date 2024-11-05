package com.java.String;

import java.util.HashSet;
import java.util.Set;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String input = "ababa";
        Set<String> palindromicSubstrings = findPalindromicSubstrings(input);
        System.out.println("Palindromic Substrings: " + palindromicSubstrings);
    }

    public static Set<String> findPalindromicSubstrings(String s) {
        Set<String> result = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes centered at `i`
            expandAroundCenter(s, i, i, result);

            // Check for even-length palindromes centered between `i` and `i+1`
            expandAroundCenter(s, i, i + 1, result);
        }

        return result;
    }

    private static void expandAroundCenter(String s, int left, int right, Set<String> result) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            result.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }
}