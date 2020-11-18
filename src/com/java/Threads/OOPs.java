package com.java.Threads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OOPs implements Serializable {


    public static void main(String[] args) {
        List<Object> obj = new ArrayList<>();
        obj.add("String");
        obj.add(1);
        obj.add(new RuntimeException());

        for (Object obj1 : obj) {
            System.out.println(obj1);
        }
    }




}
