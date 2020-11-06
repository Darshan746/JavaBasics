package com.java.String;

public class PermutationOfString {


    public  static String swapString(String str, int i, int j){
        char[] b = str.toCharArray();
        char c;
        c=b[i];
        b[i]=b[j];
        b[j]=c;
        return String.valueOf(b);
    }

    public static void main(String[] args) {
       generatePermutation("abc",0,3);
    }

    public static void generatePermutation(String str, int start, int end){
        if(start==end-1){
            System.out.println(str);
        }else {
            for(int i=start;i<end;i++){
                str= swapString(str, start, i);
                generatePermutation(str,start+1,end);
                str = swapString(str, start, i);
            }
        }
    }

}
