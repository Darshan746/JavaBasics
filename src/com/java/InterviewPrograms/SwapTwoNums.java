package com.java.InterviewPrograms;

public class SwapTwoNums
{

    public static void main(String args[])
    {
        int num1 = 10;
        int num2=20;
        
        num1 = num1+num2;
        num2= num1-num2;
        num1 = num1-num2;
        
        System.out.println(num2);
        System.out.println(num1);
    }
}
