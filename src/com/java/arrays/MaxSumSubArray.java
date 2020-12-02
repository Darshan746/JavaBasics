package com.java.arrays;

//Maximum Sum SubArray (Kadane's algorithm) (Largest Sum Contigous SubArray)
public class MaxSumSubArray {
    public static void findMaxSumSubArray(int[] array) {
        int max_so_far = array[0];
        int max_ending_here = 0;

        int start=0, end=0, s=0;

        for(int i=0; i< array.length;i++){
            max_ending_here = max_ending_here+array[i];
            if(max_ending_here > max_so_far){
                max_so_far = max_ending_here;
                start=s;
                end=i;
            }
            if(max_ending_here < 0){
                max_ending_here = 0;
                s = i+1;
            }
        }
        System.out.println("maximum Sum " +max_so_far);
        System.out.println("starting at "+start+" "+"ending at"+end);
    }

    public static void main(String[] args) {


        int[] array = {4,2,-2};
        findMaxSumSubArray(array);
    }
}
