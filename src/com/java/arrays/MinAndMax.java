package com.java.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Find the maximum and minimum value of an array
public class MinAndMax {

    private static  void findMinAndMaxOfArray(int[] array){

        int max = array[0];
        int min = array[0];
        int i = 0;
        while(i < array.length){
            if(array[i]>max){
                max = array[i];
            }if(array[i]<min){
                min = array[i];
            }
            i++;
        }
        System.out.println("Min value is = "+min + " "+"max value is "+" ="+max);

    }

    public static void findMinAndMax(Integer[] array) {
        List<Integer> integers = Arrays.asList(array);
        System.out.println("Max Ele"+Collections.max(integers));
        System.out.println("Min Ele"+Collections.min(integers));

    }

    public static void main(String[] args) {
        int a[] = {1,30,2,-1,3,4,5,20,90};
        findMinAndMaxOfArray(a);
        Integer ar[] = {1,30,2,-1,3,4,5,20,90};
        findMinAndMax(ar);
    }
}
