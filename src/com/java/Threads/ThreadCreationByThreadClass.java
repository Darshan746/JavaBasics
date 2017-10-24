package com.java.Threads;
/**
 * Thread Creation using the Thread Class
 * @author Darshan
 *
 */
public class ThreadCreationByThreadClass extends Thread 
{

	@Override
	public void run()
	{
		System.out.println("Thread is running");
	}
	
	public static void main(String args[])
	{
		ThreadCreationByThreadClass t = new ThreadCreationByThreadClass();
		t.start();
	}
}
