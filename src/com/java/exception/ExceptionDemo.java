package com.java.exception;

public class ExceptionDemo
{
    
    public static void main(String[] args)
    {

        try{
            ExceptionDemo.addDemo();
        }catch (Exception e){
            System.out.println("Hello");
        }
        }
      
    
    
    
    public static void addDemo() throws NullPointerException {
        try {
            int a = 10/0;
            // throw new CustomRuntimeException("hh");
        }catch (ArithmeticException e){
            throw e;
        }
      //  System.out.println("");
    }
    
    
    public static void addDemo1() {
       ExceptionDemo.addDemo();
    }
    

}
