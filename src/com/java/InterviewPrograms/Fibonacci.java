package com.java.InterviewPrograms;

public class Fibonacci
{
    static int n1 = 0, n2 = 1, n3 = 0;

    
    //Using recursion
    static void printFibonacci(int count)
    {
        if (count > 0)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }

    public static void main(String[] args)
    {
        int n1 = 0, n2 = 1, n3;

        //Using Normal 
        for (int i = 1; i <= 10; i++)
        {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;

        }
    }
}
