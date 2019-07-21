package com.java.thread.executor;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo
{
    
  //  AtomicInteger counter = new AtomicInteger(0);
    int counter = 0;
    
    
    public void incrementCounter() {
        counter++;
        //counter.incrementAndGet();
    }



    public int getCounter() {
        return counter;// counter.get();
    }

}
