package com.java.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ApplePredicateDemo
{
    static List<Apple> appleList;
    static {
        
        appleList = new ArrayList<>();
        appleList.add(new Apple(150, "green"));
        appleList.add( new Apple(10, "red"));
        appleList.add( new Apple(170, "Green"));
    }
    static Predicate<Apple> weighPredicate = apple->apple.getWeight()>=150;
    static Predicate<Apple> isColorOrange = apple ->  apple.getColor().equals("Orange");
    
   public static List<Apple> filterApple(List<Apple> apples, Predicate<Apple> predicate) {
       return apples.stream().filter(predicate).collect(Collectors.toList());
   }
   
   
   public static void main(String[] args)
{
       List<Apple> apples = ApplePredicateDemo.filterApple(appleList,weighPredicate.negate());
       System.out.println(apples);
}
}

