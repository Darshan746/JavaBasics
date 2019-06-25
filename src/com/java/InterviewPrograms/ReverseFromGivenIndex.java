package com.java.InterviewPrograms;

public class ReverseFromGivenIndex
{

    private static void reverseArrayFromIndex(int index, int[] array)
    {
        if (array != null && array.length > index)
        {
            Integer tmp1[] = new Integer[index + 1],
                tmp2[] = new Integer[array.length - index - 1];

            for (int i = index, k = 0; i >= 0; i--, k++)
            {
                tmp1[i] = array[k];
            }

            for (int j = index + 1, k = 0; j < array.length; j++, k++)
            {
                tmp2[k] = array[j];
            }
            int[] merge = new int[tmp1.length + tmp2.length];

            for (int i = 0; i < tmp1.length; i++)
            {
                merge[i] = tmp1[i];
            }
            for (int i = 0; i < tmp2.length - 1; i++)
            {
                merge[i + tmp1.length] = tmp2[i];
            }

            for (int a : merge)
            {
                System.out.print(a);
            }

        }

    }

    public static void main(String[] args)
    {

        int[] reverseArray =
        { 2, 3, 5, 1, 7, 8 };
        ReverseFromGivenIndex.reverseArrayFromIndex(1, reverseArray);
    }

}
