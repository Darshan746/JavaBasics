package com.java.CollectionExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakhashMapDemo {

	public static void main(String[] args) {
		Map hashMap= new HashMap();
		
		WeakHashMap weak = new WeakHashMap();
		
		String name1 =new String("Darsghan");
		String name2=new String("Ramesh");
		
		hashMap.put(name1, "Ram");
		weak.put(name2, "Dars");
		System.gc();
		
		System.out.println(hashMap.get(name1)+" "+weak.get(name2));
		
		//name1=null;
		name2=null;
		System.gc();
		System.out.println(hashMap+" "+weak);
		
		
		
	}
}
		
        