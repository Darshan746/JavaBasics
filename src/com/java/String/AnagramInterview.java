package com.java.String;

import java.util.*;

public class AnagramInterview {

    //Input ["yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"]
    //Output : [["foo"],["flop","olfp"],["oy","yo"],["act","cat","tac"]]
    public static void groupAnagram(String[] stringArray) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : stringArray) {
            char[] chars = str.toCharArray();
            char[] originalChar = str.toCharArray();
            Arrays.sort(chars);
            if (map.containsKey(String.valueOf(chars))) {

                List<String> strings = map.get(String.valueOf(chars));
                strings.add(String.valueOf(originalChar));
                map.put(String.valueOf(chars), strings);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(String.valueOf(originalChar));
                map.put(String.valueOf(chars), strList);
            }
        }
        System.out.println(map.values());
    }

    public static void main(String[] args) {
        String[] array = {"yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"};
         groupAnagram(array);
    }
}
