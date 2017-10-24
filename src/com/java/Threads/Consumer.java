package com.java.Threads;

public class Consumer extends Thread {

	@Override
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Consumer Thread"+" "+i);
			//Thread.yield();
		}
		
	}
}

