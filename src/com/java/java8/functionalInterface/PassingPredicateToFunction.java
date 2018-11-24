package com.java.java8.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PassingPredicateToFunction
{

    String name, role;
    PassingPredicateToFunction(String a, String b){
        name = a;
        role = b;
    }
    String getRole() { return role; }
    String getName() { return name; }

    public String toString(){
       return "User Name : " + name + ", Role :" + role;
    }

    public static void main(String args[])
    {
        List<PassingPredicateToFunction> users = new ArrayList<PassingPredicateToFunction>();
        users.add(new PassingPredicateToFunction("John", "admin"));
        users.add(new PassingPredicateToFunction("Peter", "member"));
        List admins = process(users,(PassingPredicateToFunction u) -> u.getRole().equals("admin"));
        System.out.println(admins);
    }

    public static List<PassingPredicateToFunction> process(List<PassingPredicateToFunction> users,
                                     Predicate<PassingPredicateToFunction> predicat)
             {
                 List<PassingPredicateToFunction> result = new ArrayList<PassingPredicateToFunction>();
                 for (PassingPredicateToFunction user: users)
                     if (predicat.test(user))
                         result.add(user);
                 return result;
             }
}
