package com.java.exception;

public class ExceptionDemo
{
    
    public static void main(String[] args)
    {
      
            ExceptionDemo.addDemo();
        }
      
    
    
    
    public static void addDemo() throws CustomRuntimeException {
        throw new CustomRuntimeException("hh");
      //  System.out.println("");
    }
    
    
    public static void addDemo1() {
       ExceptionDemo.addDemo();
    }
    

}
