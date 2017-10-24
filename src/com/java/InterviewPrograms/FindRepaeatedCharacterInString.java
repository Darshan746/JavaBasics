package com.java.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindRepaeatedCharacterInString {

	public static void findRepeatedCharacter(String word) {

		char[] charArray = word.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(Character ch : charArray) {
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}else{
				map.put(ch, 1);
			}
		}

		Set<Entry<Character, Integer>> set = map.entrySet();
		System.out.println("Repeated characters");
		for(Entry<Character, Integer> entrySet : set) {
			if(entrySet.getValue()>1){
				System.out.printf("%s%n",entrySet.getKey()+"-------> "+entrySet.getValue());
			}
		}
	}

	public static void main(String args[]) {
		FindRepaeatedCharacterInString.findRepeatedCharacter("darshananDada");
	}
}
