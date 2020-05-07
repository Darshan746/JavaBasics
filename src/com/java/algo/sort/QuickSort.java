package com.java.algo.sort;

import java.util.Arrays;

public class QuickSort {


    static  void quickSort(int array[],int first,int last) {
        int i, j, pivot, temp;

        if (first < last) {
                pivot = first;
                i = first;
                j = last;

                while (i < j) {
                    while (array[i] <= array[pivot] && i < last)
                        i++;
                    while (array[j] > array[pivot])
                        j--;
                    if (i < j) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
                //if i crosses j
                 temp = array[pivot];
                 array[pivot] = array[j];
                 array[j] = temp;
                 quickSort(array, first, j - 1);
                 quickSort(array, j + 1, last);
        }
    }

    public static void main(String[] args) {
        int[] array = {2,1,60,23,98,5};

        System.out.println("Before sorting elements");
        Arrays.stream(array).forEach(p->{
            System.out.print(p+" ");
        });
        quickSort(array, 0, array.length-1);
        System.out.println();
        System.out.println("After sorting elements");
        Arrays.stream(array).forEach(p->{
            System.out.print(p+" ");
        });
    }
}
