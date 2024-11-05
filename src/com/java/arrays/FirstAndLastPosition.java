package com.java.arrays;

/**
 * You are gIven an array of integers that is sorted in an ascending order and a target value.
 * Find the index of first and last occurrence of the element in a fastest way possible.
 * The desired complexity is less than linear time.
 */
public class FirstAndLastPosition {


    public static int findLeftBound(int[] arr, int target) {
        int low = 0;
        int index=-1;
        int high = arr.length - 1;
        while (low <= high) {
        int mid = low + (high-low)/2;
        if (arr[mid] == target){
            index=mid;
            high = mid-1;
        }
        else if(arr[mid]<target){
            low= mid+1;
        }else {
            high = mid-1;
        }
        }
        return index;
    }



    public static int findRightBound(int[] arr, int target) {
        int low = 0;
        int index=-1;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (arr[mid] == target){
                index=mid;
                low = mid+1;
            }
            else if(arr[mid]<target){
                low= mid+1;
            }else {
                high = mid-1;
            }
        }
        return index;
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5,6};
        System.out.println(findLeftBound(arr, 3));
        System.out.println(findRightBound(arr, 3));
    }
}

