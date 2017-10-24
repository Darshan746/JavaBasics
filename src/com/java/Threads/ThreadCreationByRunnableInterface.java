package com.java.Threads;

public class ThreadCreationByRunnableInterface implements Runnable {

	@Override
	public void run()
	{
		System.out.println("Thread is Running");
		
	}
	
	public static void main(String args[])
	{
		
		ThreadCreationByRunnableInterface t = new ThreadCreationByRunnableInterface();
		Thread t1 = new Thread(t, "darshan");
		t1.start();
		System.out.println("name of the Thread is "+t1.getName());
	}

}
