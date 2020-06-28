package com.java.arrays;

import java.util.Arrays;

public class SortArrayInWaveForm {


    public static void sortArrayInWaveForm(int[] array) {



        for(int i=0; i<array.length-1; i++) {

            if(i%2 == 0) {
                if(!(array[i]< array[i+1])) {
                    swap(array, i,i+1);
                }
            }
            else
            {
                if(!(array[i] > array[i+1])) {
                    swap(array, i, i+1);
                }
            }
        }

        System.out.println("Printing the Wave form Array");
        System.out.print(Arrays.toString(array));
    }


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i]= array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {35,3,2,5,1,8,9};
        sortArrayInWaveForm(array);
    }


}
