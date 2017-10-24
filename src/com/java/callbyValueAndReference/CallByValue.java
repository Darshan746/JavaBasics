package com.java.callbyValueAndReference;

public class CallByValue
{
    private int amount = 10000;

    private void changeData(int amount)
    {
        amount = amount + 200000;
        System.out.println("Amount inside the method is " + amount);
    }

    public static void main(String args[]) throws InterruptedException
    {
        CallByValue callBy = new CallByValue();
     
        callBy.changeData(3999);
        System.out.println("Instance variable amount value is " + callBy.amount);
    }
    /** 
     *  O/P
     * 
     *  Amount inside the method is 203999
     *  Instance variable amount value is 10000
     *
     **/
    
}
