package com.java.thread.executor;

public class AtomicIntegerThreadDemo
{

    public static void main(String[] args) throws InterruptedException
    {
        
        AtomicIntegerDemo demo = new AtomicIntegerDemo();
        
        Thread t1 = new Thread(new Runnable()
        {
            
            @Override
            public void run()
            {
                for(int i=1;i<=100;i++) {
                demo.incrementCounter();
                }
                
            }
        });
        
        Thread t2 = new Thread(new Runnable()
        {
            
            @Override
            public void run()
            {
                for(int i=1;i<=100;i++) {
                demo.incrementCounter();
                }
                
            }
        });
        
        t1.start();
        t2.start();
        Thread.sleep(100);
        
        System.out.println("Final Value is "+demo.getCounter());
    }
}
