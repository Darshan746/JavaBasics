package com.java.InterviewPrograms;

import java.util.HashMap;
import java.util.Set;

public class StarProgram {
	public static void main(String args[]) {
		String s1="programming is fun programming is pleasure programming is hobby ";
		String[] tempStr = s1.split(" ");
		HashMap<String, Integer> strCount = new HashMap<String, Integer>();
		for (String st : tempStr)
		{
			if (strCount.containsKey(st))
			{
				strCount.put(st, strCount.get(st)+1);
			}
			else
			{
				strCount.put(st, 1);
			}
		}
		Set<String> strFinal = strCount.keySet();
		for (String str : strFinal)
		{
			if (strCount.get(str) > 1)
			{
				System.out.println(str + " : " + strCount.get(str));
			}
		}
		System.out.println(strFinal.toString());
	}
	

}

