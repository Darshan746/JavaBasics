package com.java.InterviewPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SuppressWarnings ("rawtypes")
public class DupeStringFindAndOccurance
{

    @SuppressWarnings ("unchecked")
    public static void findRepeatedWords(String string)
    {

        String[] words = string.split(" ");
        Map<String, Integer> mapCount = new HashMap<>();
        for (String word : words)
        {
            if (mapCount.containsKey(word))
            {
                mapCount.put(word, mapCount.get(word) + 1);
            }
            else
            {
                mapCount.put(word, 0);
            }
        }
        Set<Entry<String, Integer>> set = mapCount.entrySet();

        Iterator it = set.iterator();
        while (it.hasNext())
        {
            Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
            System.out.println(entry.getKey() + " " + "is repeated" + " " + entry.getValue() + " " + "times");
        }

    }

    public static void main(String[] args)
    {
        DupeStringFindAndOccurance.findRepeatedWords("Hi darhan How are you How are things");
    }
}
