package com.java.arrays;

import java.util.Arrays;

public class LeftRotate {

    public void leftRotate(int[] array, int digit, int length) {

            for(int i=0;i<digit ; i++) {
                leftRotateByOne(array, length);
            }
    }

    public void leftRotateByOne(int [] array, int length) {
        int temp = array[0];
        int j = 0;
        for( j=0;j<length-1;j++) {
            array[j] = array[j+1];
        }
        array[j] = temp;
    }

    public void displayArray(int[] array) {
        Arrays.stream(array).forEach(p-> System.out.print(p+" "+" "));
    }

    public static void main(String[] args) {
        int[] array = {1,3,4,2,5,6};
        LeftRotate leftRotate = new LeftRotate();
        leftRotate.leftRotate(array,2,6);
        leftRotate.displayArray(array);
        //op===> 4 2 5 6 1 3
    }
}
