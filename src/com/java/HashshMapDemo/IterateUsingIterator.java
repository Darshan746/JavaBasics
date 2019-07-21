package com.java.HashshMapDemo;

import java.util.*;
import java.util.Map.Entry;

public class IterateUsingIterator {

	public static void main(String args[]) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("darshan", 27);
		hm.put("rajesh", 28);
		hm.put("Ravan", 32);

		Set<Entry<String, Integer>> set = hm.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> k = it.next();
			System.out.println(k.getKey());
			System.out.println(k.getValue());



			}

		}
	}

