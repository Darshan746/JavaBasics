package com.java.InterviewPrograms;

public class ReverseFromGivenIndex
{

    private static void reverseArrayFromIndex(int index, int[] array)
    {
        int l=0, r= index;

        while(l<r){
            int tnp = array[r];
            array[r]=array[l];
            array[l]= tnp;
            l++;
            r--;
        }
        for(int a: array){
            System.out.print(a+" ");
        }

    }

    public static void main(String[] args)
    {

        int[] reverseArray =
        { 2, 3, 5, 1, 7, 8 };
        ReverseFromGivenIndex.reverseArrayFromIndex(5, reverseArray);
    }

}
