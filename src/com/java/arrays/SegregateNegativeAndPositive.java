package com.java.arrays;

import java.util.Arrays;

public class SegregateNegativeAndPositive {

    public static  void sortPositiveAndNegative(int[] array) {
        int i=0, j=array.length-1;

        while(true) {

            while(array[i]<0 && i<j) {
                i++;
            }
            while(array[j]>0 && i<j) {
                j--;
            }
            if(i<j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }else
                break;
        }
    }

    public static void main(String[] args) {
        int[] array = {-2,3,-5,8,-9,-10,2};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(array));
        sortPositiveAndNegative(array);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(array));
    }
}
