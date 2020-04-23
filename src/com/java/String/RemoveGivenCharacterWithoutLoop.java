package com.java.String;

public class RemoveGivenCharacterWithoutLoop {

    public static String removeRecursive(String word, char ch) {
        int index = word.indexOf(ch);
         if(index == -1)
        { return word; }
    return removeRecursive(word.substring(0, index) + word.substring(index +1, word.length()), ch); }


    public static void main(String[] args) {
        System.out.println(removeRecursive("darshan", 'a'));
    }
}


