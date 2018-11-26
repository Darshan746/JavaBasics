package com.java.java8.Optional;

import java.util.Optional;

public class OptionalDemo
{
    
   static  Optional<String> name = Optional.ofNullable(null); //Optional.ofNullable("dadrsha");
    public static void main(String[] args)
    {
      System.out.println(name);
         
    }
}
