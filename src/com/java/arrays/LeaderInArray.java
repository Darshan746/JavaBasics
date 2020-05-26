package com.java.arrays;

//The element should be greater than its right side elements then its a Leader in the array
public class LeaderInArray {

    public void printLeader(int[] array) {
        int j;
        for(int i=0;i<array.length-1;i++) {
            for ( j= i+1; j<array.length-1; j++){
                if (array[i] < array[j]){
                    break;
                }
                if(j==array.length)
                System.out.println(array[i]);
            }

        }
    }


    public static void main(String[] args) {
        
    }



}
