package com.java.arrays;

public class FindOddNumberInArray {

//find odd no in array which contain only single odd.
    public static int findOdd(int[] array) {
        int res =0;
        for(int i=0; i<array.length; i++) {
            res ^= array[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array =  {1,1,2,2,3,3,4,5,5};
        System.out.println(findOdd(array));
    }
}
