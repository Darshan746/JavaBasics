package com.java.java8.functionalInterface;

import java.util.function.Predicate;



/** Predicate is a functional interface which accept the single argument
    and returns the boolean value
 */
public class PredicateDemo {

    static Predicate<Integer> p1 = i -> i >= 10;
    static Predicate<Integer> p2 = i -> i % 2 == 0;
    
    
    
    
    public static  void checkPredicates(int x,Predicate<Integer> p ) {
        if(p.test(x)) {
            System.out.println(x);
        }
    }
    
    public static void main(String[] args){
        
        PredicateDemo.checkPredicates(5, p1);
        
        //predicate functions
        PredicateDemo.checkPredicates(7, p1.negate());
        PredicateDemo.checkPredicates(11, p1.and(p2)); //joining of predicate // combining multiple predicate
        PredicateDemo.checkPredicates(13, p1.or(p2));
    }
}
