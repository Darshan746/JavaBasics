package com.java.String;

public class RemoveGivenCharUsingRecursion {


    public static String finalString(String word, char ch){
        int index = word.indexOf(ch);
        if(index == -1){
            return word;
        }
        return finalString(word.substring(0,index)+word.substring(index+1,word.length()), ch);
    }

    public static void main(String[] args) {
        System.out.println(finalString("Darshan", 'a'));
    }

}
