package com.java.datastructure;

//The time complexity of the binary search algorithm is O(log n).

//The best-case time complexity would be O(1) when the central index would directly match the desired value.
// The worst-case scenario could be the values at either extremity of the list or values not in the list.
public class BinarySearch {

    //For binary search , input array should be Sorted
    public static int binarySearch(int[] array, int start, int end, int target) {
        int mid = (start + end) / 2;
        if (target == array[mid]) {
            return mid;
        }
        if(target < array[mid]) {
            end = mid ;
            while (start < end) {
                if (array[start] == target) {
                    return start;
                }
                start++;
            }
        }
        if(target > array[mid]) {
            start = mid + 1;
            while (start < end) {
                if (array[start] == target) {
                    return start;
                }
                start++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
      int[] array = {1,2,3,5,6,8};
        System.out.println(binarySearch(array, 0, array.length, 50));
    }
}