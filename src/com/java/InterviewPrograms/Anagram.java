package com.java.InterviewPrograms;

import java.util.Arrays;



/*Two strings are called anagrams if 
they contain same set of characters but in different order.
For example, “Dormitory – Dirty Room”, “keep – peek”,  “School Master – The Classroom” 
are some anagrams.*/
public class Anagram
{

    public static boolean isAnagram(String s1, String s2)
    {
        String copyS1 = s1.replaceAll("\\s", "").toLowerCase();
        String copyS2 = s2.replaceAll("\\s", "").toLowerCase();

        if (copyS1.length() == copyS2.length())
        {
            char[] charArray1 = copyS1.toCharArray();
            char[] charArray2 = copyS2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            for (int i = 0; i < charArray1.length; i++)
            {
                if (charArray1[i] != charArray2[i])
                {
                    return false;
                }

            }
            return true;
        }
        return false;   
        
    }
    public static void main(String[] args)
    {
       System.out.println(Anagram.isAnagram("keep ", "peke"));
    }

}
