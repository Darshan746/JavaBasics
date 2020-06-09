package com.java.InterviewPrograms;

import java.util.*;
import java.util.Map.Entry;

public class TwoArrayUnCommonNumberPrinting {


	public static void main(String args[]) {
		// Make the two lists
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 4, 5, 6,2);
		List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
		// Prepare a union
		Set<Integer> union = new HashSet<Integer>(list1);
		union.addAll(list2);
		// Prepare an intersection
		Set<Integer> intersection = new HashSet<Integer>(list1);
		intersection.retainAll(list2);
		// Subtract the intersection from the union
		union.removeAll(intersection);
		// Print the result
		for (Integer n : union) {
			System.out.println(n);

		}


	}}
