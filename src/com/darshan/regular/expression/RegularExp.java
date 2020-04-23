package com.darshan.regular.expression;

import com.java.Collection.ComparatorDemo.Employee;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

    public static void main(String[] args) {

       Pattern pattern1 = Pattern.compile("(<\\d*>) | (<\\w*>)");


        String name = "Dec 31 03:44:00.151211 (2526173242360594433) <02777> <calqeauto> [debug] {mktCustomerContext} initializing local cache 'request' 'darshan'";

        Matcher matcher = pattern1.matcher(name);

     while (matcher.find()){
         System.out.print(matcher.group()+ " ");
     }


    }
}
