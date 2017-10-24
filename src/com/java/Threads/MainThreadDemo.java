package com.java.Threads;

public class MainThreadDemo 
{
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		t.setName("Settable Name");
		System.out.println(t.getName());
	}

}
