package com.java.java8.predicate;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        List<String> l = new ArrayList();
        l.add("Darshan");
        l.add("Darsh");

        //Consumer functional interface
        Consumer<List<String>> strList = (a)-> a.forEach(s-> System.out.println());
        strList.accept(l);

        //Predicate Functional interface
        Predicate<Integer> a = (b)-> b>10;
        Predicate<Integer> b = (c)-> c>20;

        boolean f = a.and(b).test(30);
        System.out.println(Predicate.isEqual(f).and( Predicate.isEqual(b)).test(40));


        //Function functional interface.
        List<String> strNum = new ArrayList<>();
        strNum.add("2");
        strNum.add("3");

        List<Integer> numList = new ArrayList<>();
        Function<List<String>, List<Integer>> integerList = (strList1)-> {strList1.forEach(c->numList.add(Integer.valueOf(c)));
        return numList;};

        integerList.apply(strNum);
        numList.forEach(m-> System.out.println(m));


        //Operator

        UnaryOperator<Integer> x = (y)->  y+1;
        System.out.println("unary operator in java functional interface");
        System.out.println(x.apply(3));
        UnaryOperator<Integer> y = (z)->  z*2;
        System.out.println("andThen in unaryOperator "+x.andThen(y).apply(2));
        System.out.println("andThen in unaryOperator" +x.compose(y).apply(2));



















    }

}
