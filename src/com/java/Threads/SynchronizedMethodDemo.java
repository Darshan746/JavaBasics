package com.java.Threads;

public class SynchronizedMethodDemo extends Thread{
	
	public SynchronizedMethod synchronizedMethod;
	String name;
	
	public void run(){
		synchronizedMethod.wish(name);
	}
	
	public SynchronizedMethodDemo(SynchronizedMethod synchronizedMethod, String name) {
		this.synchronizedMethod = synchronizedMethod;
		this.name = name;
	}



	public static void main(String args[]) {
	SynchronizedMethod d = new SynchronizedMethod();
	SynchronizedMethod d2 = new SynchronizedMethod();
		Thread t = new SynchronizedMethodDemo(d, "object1 t");
		Thread t2 = new SynchronizedMethodDemo(d, "object t2");
		Thread t3 = new SynchronizedMethodDemo(d2, "object 3");
		Thread t4 = new SynchronizedMethodDemo(d2, "object4");
		t.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
