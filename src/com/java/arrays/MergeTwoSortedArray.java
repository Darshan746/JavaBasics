package com.java.arrays;

import java.util.Arrays;

public class MergeTwoSortedArray
{

    public static void mergeTwoSortedArray(int[] arrayOne, int[] arrayTwo) {
        int i=0;
        int j = 0;
        int k =0;
        int[] resultantArray = new int[arrayOne.length+arrayTwo.length];

        while(i<arrayOne.length && j < arrayTwo.length) {
            if(arrayOne[i] < arrayTwo[j]){
                resultantArray[k++] = arrayOne[i];
                i++;
            }
            else {
                resultantArray[k++] = arrayTwo[j];
                j++;
            }

        }
        while (i<arrayOne.length) {
            resultantArray[k++] = arrayOne[i];
            i++;
        }
        while(j<arrayTwo.length){
            resultantArray[k++] = arrayTwo[j];
            j++;
        }
        System.out.println("Printing Array 1"+ " "+ Arrays.toString(arrayOne));
        System.out.println("Printing the Array 2"+ " "+ Arrays.toString(arrayTwo));
        System.out.println("Printing the Resultant Array"+ " "+Arrays.toString(resultantArray));
    }

    public static void main(String[] args) {
        int[] arrayOne = {5,6,7,8};
        int[] arrayTwo = {1,2,3,8,9,10};
        mergeTwoSortedArray(arrayOne, arrayTwo);

    }
}
