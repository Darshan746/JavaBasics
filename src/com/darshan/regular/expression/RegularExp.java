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

//
//        Pattern mailPattern  = Pattern.compile("[a-zA-Z][\\w._]*@[a-zA-z]*[.][a-zA-z]*");
//        Matcher match = mailPattern.matcher("darshan.mn746@gmail.com");
//
//        if(match.find()){
//            System.out.println(match.group());
//        }




        //Gmail Id regular Expression

//        // darshan.mn746@gmail.com
//
//        String mob = "98863236011";
//
//        Pattern pattern = Pattern.compile("[7-9][0-9]{9}");
//        Matcher m = pattern.matcher(mob);
//       while(m.find() && match.group().equals(mob)){
//           System.out.println(m.group());
//       }
       Pattern pattern1 = Pattern.compile("('\\w+')|(<\\d*>) | (<\\w*>)");


        String name = "Dec 31 03:44:00.151211 (2526173242360594433) <02777> <calqeauto> [debug] {mktCustomerContext} initializing local cache 'request' 'darshan'";

        Matcher matcher = pattern1.matcher(name);

     while (matcher.find()){
         System.out.print(matcher.group()+ " ");
     }


    }
}
