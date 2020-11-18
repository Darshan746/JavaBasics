package com.java.InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class LongestSubString
{
    static void longestSubstring(String inputString)
    {
        // Convert inputString to charArray

        char[] charArray = inputString.toCharArray();

        // Initialization

        String longestSubstring = null;

        int longestSubstringLength = 0;

        // Creating LinkedHashMap with characters as keys and their position as values.

        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();

        // Iterating through charArray

        for (int i = 0; i < charArray.length; i++)
        {
            char ch = charArray[i];

            // If ch is not present in charPosMap, adding ch into charPosMap along with its position

            if (!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }

            // If ch is already present in charPosMap, re posioning the cursor i to the position of ch and clearing the charPosMap

            else
            {
                //i = charPosMap.get(ch);

                charPosMap.clear();
            }

            // Updating longestSubstring and longestSubstringLength

         //   if (charPosMap.size() > longestSubstringLength)
            //{
                //longestSubstringLength = charPosMap.size();

               // longestSubstring = charPosMap.keySet().toString();
            //}
        }

        longestSubstringLength = charPosMap.size();

        longestSubstring = charPosMap.keySet().toString();
        System.out.println("Input String : " + inputString);

        System.out.println("The longest substring : " + longestSubstring);

        System.out.println("The longest Substring Length : " + longestSubstringLength);
    }

    public static void main(String[] args)
    {
        longestSubstring("Arbindaode");

        System.out.println("==========================");
List<String> str = new ArrayList<>();
str.add("code");


        str.add("code");
        str.add("doce");
        str.add("ecod");
        str.add("framer");
        str.add("frame");

        System.out.println(funWithAnagrams(str));
    }



    public static List<String> funWithAnagrams(List<String> text) {

        List<String> strlist = text;
        for(int i=0;i<text.size()-1;i++){
            for(int j=i+1; j<text.size(); j++){
                String firstStr = text.get(i);
                String seconStr = text.get(j);
                if(firstStr.length()==seconStr.length()){
                    char[] firstChar = firstStr.toCharArray();
                    char[] secondChar = seconStr.toCharArray();
                    Arrays.sort(firstChar);
                    Arrays.sort(secondChar);
                    if(String.valueOf(firstChar).equals(String.valueOf(secondChar))){
                        strlist.remove(seconStr);
                    }
                }
            }
        }
        return strlist;
    }
}
