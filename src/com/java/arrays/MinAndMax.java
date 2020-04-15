package com.java.arrays;

//Find the maximum and minimum value of an array
public class MinAndMax {

    private static  void findMinAndMaxOfArray(int[] array){

        int max = array[0];
        int min = array[0];

        for(int arrayVal : array){
            if(arrayVal>max){
                max=arrayVal;
            }
            else if(arrayVal<=min){
                min = arrayVal;
            }
        }
        System.out.println("Min value is = "+min + " "+"max value is "+" ="+max);

    }

    public static void main(String[] args) {
        int a[] = {1,30,2,3,4,5,20};
        findMinAndMaxOfArray(a);
    }
}
