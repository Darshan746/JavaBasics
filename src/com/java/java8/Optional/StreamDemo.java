package com.java.java8.Optional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo
{

    private static Integer[] numbers = {1,3,2,4,5,4};
    
    
    public static void main(String[] args)
    {
       List<Integer> evenInteger=  Stream.of(numbers).filter(i->i%2==0).collect(Collectors.toList());
       for(Integer integer : evenInteger) {
          System.out.println(integer.intValue());
       }
       
       //Map method
       evenInteger.stream().map(x->x*2).forEach(y->System.out.println(y));
       
       //Distinct method
       evenInteger.stream().distinct().forEach(x->System.out.println(x));
       
    }
    
}
