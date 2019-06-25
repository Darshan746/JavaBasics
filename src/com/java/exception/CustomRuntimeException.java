package com.java.exception;

public class CustomRuntimeException extends RuntimeException
{
    
    public String message ;
    
    public CustomRuntimeException(String message)
    {
       super(message);
    }
    

}
