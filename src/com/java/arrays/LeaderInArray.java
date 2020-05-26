package com.java.arrays;

//The element should be greater than its right side elements then its a Leader in the array
public class LeaderInArray {

    public static void printLeader(int[] array) {
        int j;
        for(int i=0;i<=array.length-1;i++) {
            for ( j= i+1; j<=array.length-1; j++){
                if (array[i] < array[j]){
                    break;
                }
                if(j==array.length-1)
                System.out.print(array[i]+" ");
            }

        }
        System.out.println(array[array.length-1]);
    }


    public static void main(String[] args) {
        int[] array = {5,4,6,3,9,1};
printLeader(array);
    }



}
