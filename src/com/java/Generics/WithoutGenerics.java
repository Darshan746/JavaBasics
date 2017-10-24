package com.java.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WithoutGenerics {
	
	public static void main(String args[]) {
		List list = new ArrayList();
		list.add("darshan");
		list.add("sundar");
		list.add("Raghu");
		list.add(3);// Class Cast exception will  throw @ line 17
		Iterator it = list.iterator();
		while(it.hasNext()){
			String names = (String)it.next();  // need to cast Explicitly to type String 
			System.out.println(names);
		}
	}

}
