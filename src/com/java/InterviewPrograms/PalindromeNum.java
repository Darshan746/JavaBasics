package com.java.InterviewPrograms;

public class PalindromeNum
{

    public static void main(String[] args)
    {
        int num = 232;
        int temp = num;
        StringBuilder b = new StringBuilder();
        while (temp != 0)
        {
            b.append(temp % 10);
            temp = temp / 10;
        }
        // System.out.println("hi");
        int a = Integer.valueOf(b.toString());
        System.out.println(a == num);
    }
}
