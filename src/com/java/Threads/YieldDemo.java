package com.java.Threads;

public class YieldDemo {

	public static void main(String args[]) {
		
		Thread producer = new Producer();
		Thread consumer = new Consumer();
		producer.setPriority(Thread.MIN_PRIORITY);
		consumer.setPriority(Thread.MAX_PRIORITY);
		producer.start();
		consumer.start();
		
		 	
	}
}
