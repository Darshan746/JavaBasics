package com.java.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardDemo {
	 public static void main(String[] args)
	   {
	      //List of Integers
	      List<Integer> ints = Arrays.asList(1,2,3,4,5);
	      System.out.println(sum(ints));
	       
	      //List of Doubles
	      List<Double> doubles = Arrays.asList(1.5d,2d,3d);
	      System.out.println(sum(doubles));
	       
	      List<String> strings = Arrays.asList("darshan","rakesh");
	      //This will give compilation error as :: The method sum(List&lt;? extends Number&gt;) in the 
	      //type GenericsExample&lt;T&gt; is not applicable for the arguments (List&lt;String&gt;)
	      System.out.println(sum(ints));
	       
	   
	   }
	    
	   //Method will accept 
	   private static Number sum (List<? extends Number> numbers){
	      double s = 0.0;
	      for (Number n : numbers)
	         s += n.doubleValue();
	      return s;
	   }
	   
	   

}
