package com.java.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Given an integer array , In a single move you can pick any element  and increment it by 1
 * find the min no of such moves required to make the array unique
 */
public class MovesRquiredToMakeArrayUnique {

    public static int findMinMove(int[] arr) {
        int moves=0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
             moves+= arr[i-1]-arr[i]+1;
             arr[i]= arr[i-1]+1;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,2,1,7};
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println(findMinMove(arr));
        System.out.print(Arrays.toString(arr));
    }
}
