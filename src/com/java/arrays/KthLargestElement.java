package com.java.arrays;

public class KthLargestElement {

    public static void findKthLargestEle(int k, int[] array) {

        for(int i=0;i<array.length-1; i++) {
            for(int j=i+1; j< array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
                if(i==k-1) {
                    System.out.println(k +"th largest element is "+array[i]);
                    break;
                }
            }
        }


    public static void main(String[] args) {
        int[] array = {1,5,2,6};
        findKthLargestEle(3, array);

    }
}
