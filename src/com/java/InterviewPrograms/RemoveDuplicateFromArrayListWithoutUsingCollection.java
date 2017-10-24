package com.java.InterviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromArrayListWithoutUsingCollection {

	public static void removeDupFromList(List list){

		for(int i=0;i<=list.size();i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i)==list.get(j)){
					list.remove(j);
				}
			}
		}
		System.out.println(list);
	}

	public static void main(String args[]){
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("net");
		list.add("php");
		list.add("java");
		list.add("php");
		
		removeDupFromList(list);
	}
}
