package com.java.String;

public class FirstNonRepeatedCharacter {

    private static char[] count = new char[256];
    static  int  index=-1;


    private static void getCharArrayCount(String str) {
        for(int i=0;i<str.length(); i++){
             count[str.charAt(i)]++;
        }
    }

    public static int getFirstNonRepeatedChar(String str){
        getCharArrayCount(str);
        for(int i=0; i<count.length;i++){
            if(count[str.charAt(i)]==1){
                index =i;
                return index;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        System.out.println( getFirstNonRepeatedChar("DaDaDp"));
    }

}
