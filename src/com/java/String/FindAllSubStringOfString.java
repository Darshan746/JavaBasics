package com.java.String;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubStringOfString {

    public static void main(String[] args) {
        String str = "aba";
        List<String> strList = new ArrayList<>();
        for(int i=0;i<=str.length()-1; i++) {
            for(int j = i+1; j<=str.length();j++) {
                strList.add(str.substring(i,j));
            }
        }
        System.out.println(strList);

    }
}
