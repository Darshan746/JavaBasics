package com.java.InterviewPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeparateZerosToEndinArray
{
    private static int count = 0;

    public static void separateZerosFromArray(int[] array)
    {

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != 0)
            {
                array[count++] = array[i];

            }
        }
        while (count < array.length)
    {
        array[count++] = 0;

    }
        //System.out.println(array[array.length-1]);
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 2, 4, 6, 4, 0, 5, 0,0,7 ,6};
        
        SeparateZerosToEndinArray.separateZerosFromArray(arr);
       // Map<String,String> m = new HashMap();
    }


}
