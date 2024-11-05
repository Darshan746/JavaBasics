package com.java.InterviewPrograms;

import java.io.IOException;

public class SumOfDigits
{

    public static void sumOfDigits(int digits) throws IOException
    {

        int a = 0, sum = 0;
        while (digits != 0)
        {
            a = digits % 10;
            sum = sum + a;
            digits = digits / 10;

        }
        System.out.println(sum);

    }

    public static void main(String args[]) throws IOException
    {
        sumOfDigits(3212);
    }

}
