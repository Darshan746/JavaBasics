package com.java.arrays;

import java.util.*;

/**
 * Given an integer array, sort the array according to the frequency of elements in decreasing order,
 * if frequency of two elements are same then sort in increasing order
 * I/P    { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };
 * O/P     {2 2 2 2 1 1 3 3 4 4 5 6 7}
 *
 */
public class SortArrayByFrequency {

    public static void main(String[] args) {
        int[] array = { 4, 4, 2, 2,2,2, 3, 3, 1, 1, 6, 7, 5 };
        sortArrayByFrequency(array);
    }

    public static void sortArrayByFrequency(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> outputArray= new ArrayList<>();

        for(int elem: array){
            int count = map.getOrDefault(elem, 0);
            map.put(elem, count+1);
            outputArray.add(elem);
        }
        SortedComparator sortedComparator = new SortedComparator(map);
        Collections.sort(outputArray, sortedComparator);

        for (int i: outputArray){
            System.out.print(i+" ");
        }
    }
}

class SortedComparator implements Comparator<Integer>
{
    Map<Integer, Integer> frequencyMap = new HashMap();
    SortedComparator(Map<Integer, Integer> map){
        this.frequencyMap =map;
    }
    @Override
    public int compare(Integer o1, Integer o2) {
        int frequencyCompare = frequencyMap.get(o2).compareTo(frequencyMap.get(o1));
        int valueCompare = o1.compareTo(o2);
        if (frequencyCompare == 0){
            return valueCompare;
        }else
            return frequencyCompare;
    }
}