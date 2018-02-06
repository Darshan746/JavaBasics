package com.java.InterviewPrograms;

public class CountWordsInString
{

    public static void countWordInString(String string)
    {
        String[] words = string.split(" ");

        System.out.println("Number of Words in String" + " " + words.length);
    }

    public static void main(String args[])
    {
        countWordInString("Raman ram all over the world");
    }
}
