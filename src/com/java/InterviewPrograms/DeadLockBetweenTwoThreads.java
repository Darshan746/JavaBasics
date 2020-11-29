package com.java.InterviewPrograms;

public class DeadLockBetweenTwoThreads {
		String s1 = "Java";
		String 	s2 ="C#";
		
		Thread t1 = new Thread("Thread 1") {
			public void run() {
				while(true){
					synchronized (s1) {
						synchronized (s2) {
							System.out.println("T1");
						}
					}
				}
			}
		};
		
		Thread t2 = new Thread("Thread t2"){
			public void run(){
				while(true){
					synchronized (s2) {
						synchronized (s1) {
							System.out.println("thread 2 inside");
						}
					}
				}
			}
		};
		
		
		public static void main(String args[]) {
			
			DeadLockBetweenTwoThreads d = new DeadLockBetweenTwoThreads();
			d.t1.start();
			d.t2.start();
			
		}

}
