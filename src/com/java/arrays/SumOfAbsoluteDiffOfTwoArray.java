package com.java.arrays;

public class SumOfAbsoluteDiffOfTwoArray {

    public static void getSumOfAbsoluteDiff(int[] arrayOne, int[] arrayTwo) {
        int sum =0;
        int arrayOneSize =arrayOne.length;
        int arrayTwoSize = arrayTwo.length;

        for(int i=0;i<arrayOneSize; i++){
            if(i < arrayTwo.length){
                sum+=arrayOne[i]-arrayTwo[i];;
                arrayOneSize++;
                arrayTwoSize++;
            }
        }
        while ((arrayOneSize < arrayOne.length)){
            sum+=arrayOne[arrayOneSize++];
        }
        while ((arrayTwoSize < arrayTwo.length)){
            sum+=arrayTwo[arrayTwoSize++];
        }
        System.out.println("Sum of absolute diff is "+ sum);
    }

    public static void main(String[] args) {
        int[] arrayOne = {5,2,8,9,8,12};
        int[] arrayTwo = {-4,1,7,8,10};
        getSumOfAbsoluteDiff(arrayOne, arrayTwo);
    }
}
