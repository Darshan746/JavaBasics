package com.java.thread.executor;

public class TaskOne implements Runnable
{

    @Override
    public void run() {

       System.out.println("### Thread - "+Thread.currentThread().getName()+"- Have started");

       for(int i=0;i<=10;i++) {
           System.out.println(i);
       }
       System.out.println("***Thread - "+Thread.currentThread().getName()+"- Have Finished the task");
    }

}
