package com.java.InterviewPrograms;

public class ArrayEqualityCheck
{
    
    public static  boolean checkArrayEquality(int[] a, int[] b)
    {
        if(a.length == b.length)
        {
            for(int i = 0 ;i<a.length;i++)
            {
                if(a[i]!=b[i])
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] a = {3,4,6},b={3,4,8};
        boolean val = ArrayEqualityCheck.checkArrayEquality(a, b);
       if(val)
       {
           System.out.println("Arrays are equals");
       }else
       {
           System.out.println("Arrays are not equals");
       }
    }

}
