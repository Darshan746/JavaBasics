package com.java.Threads;

public class Producer extends Thread{

	@Override
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("producer Thread"+" "+i);
			//Thread.yield();
		}
		
	}
}
