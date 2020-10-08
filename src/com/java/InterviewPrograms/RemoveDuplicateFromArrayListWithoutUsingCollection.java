package com.java.InterviewPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayListWithoutUsingCollection
{

    public static void removeDupFromList(List list)
    {

        for (int i = 0; i <= list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i).equals(list.get(j)))
                {
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("net");
        list.add("php");
        list.add("java");
        list.add("php");

       // removeDupFromList(list);
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
    }
}
