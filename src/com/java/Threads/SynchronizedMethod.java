package com.java.Threads;

public class SynchronizedMethod {
	
	public static  void wish(String name){
		synchronized(SynchronizedMethod.class) {
		for(int i=0;i<=4;i++) {
			System.out.println(name);
		}
		}
		
	}
}
