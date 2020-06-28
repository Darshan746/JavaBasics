package com.java.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSum {
    public static void subArrayWithGivenSum(int[] array, int givenSum) {
            Map<Integer, Integer> map  = new HashMap<>();
            int sum=0;
            int result=0;
            for(int i =0; i<array.length; i++) {
                sum += array[i];
                if(map.containsKey(sum-givenSum)){
                    result++;
                }
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
            System.out.println(result);
        }

    public static void main(String[] args) {
        int[] array = {1,2,8,2,8};
        subArrayWithGivenSum(array, 10);
    }

}
