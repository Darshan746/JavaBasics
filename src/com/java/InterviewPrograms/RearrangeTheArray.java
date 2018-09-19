package com.java.InterviewPrograms;
/**
 * You have been given an array and you have to make a program to convert that array such that positive elements occur at even numbered places in the array and negative elements occur at odd numbered places in the array. We have to do it in place and the relative order of the elements must be maintained.
There can be unequal number of positive and negative values and the extra values have to left as it is.

Examples:

Input : arr[] = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10}
Output : arr[] = {1, -3, 5, -3, 6, 6, 7, -4, 9, 10}

Input : arr[] = {-1, 3, -5, 6, 3, 6, -7, -4, -9, 10}
Output : arr[] = {3, -1, 6, -5, 3, -7, 6, -4, 10, -9}
 *
 *
 */
public class RearrangeTheArray
{
    
    public static void rearrange(int[] arr, int n) {
        int positive=0, negative=1;
        int arrayLenghth = arr.length;
        
        while(true) {
            
            while(positive<arrayLenghth && arr[positive] >= 0) {
                positive+=2;
            }
            while(negative<arrayLenghth && arr[negative] <= 0) {
                negative+=2;
            }
            if(positive<arrayLenghth && negative<arrayLenghth) {
                int tmp = arr[positive];
                arr[positive] = arr[negative];
                arr[negative]=tmp;
            }
            else 
            break;
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10};
        int n = arr.length;
     
        rearrange(arr, n);
        for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
    }
    

}
