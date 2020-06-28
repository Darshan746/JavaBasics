package com.java.arrays;

import java.util.Arrays;

/**
 * Divide an array into 2 parts.
 *
 * first Array is beginning to (array.length-1) - rotateDigit;
 * Second Array beginning from first arrayEnd next element to arrayLength
 *
 * Reverse the First array and Second Array which we got in previous step
 *
 * Reverse the whole array then we will get the result
 *
 */
public class RotateArray {

    public static void rotateArray( int rotateDigit, int[] array) {

        int firstArrayStart = 0;
        int firstArrayEnd = (array.length-1)-rotateDigit;
        int secondArrayBeginning = firstArrayEnd+1;
        int secondArrayEnd = array.length-1;

        //Reversing the first Array.
        while(firstArrayStart<=firstArrayEnd) {
            int temp = array[firstArrayStart];
            array[firstArrayStart] = array[firstArrayEnd];
            array[firstArrayEnd] = temp;
            firstArrayStart++;
            firstArrayEnd--;
        }
        //Reversing the Second Array.
        while(secondArrayBeginning<=secondArrayEnd) {
            int temp = array[secondArrayBeginning];
            array[secondArrayBeginning] = array[secondArrayEnd];
            array[secondArrayEnd] = temp;
            secondArrayBeginning++;
            secondArrayEnd--;
        }
        int l=0; int r=array.length-1;

        //Reverse the Whole Array.
        while (l<=r) {
            int temp = array[l];
            array[l]=array[r];
            array[r] = temp;
            l++;
            r--;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        rotateArray(2, array);
    }
}
