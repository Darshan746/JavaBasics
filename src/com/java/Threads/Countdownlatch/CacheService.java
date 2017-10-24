package com.java.Threads.Countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CacheService implements Runnable, MarkerInter
{
    private CountDownLatch latch;

    public CacheService(CountDownLatch latch)
    {
        this.latch = latch;
    }

    @Override
    public void run()
    {

        System.out.println("Cache Service is Up And Running...");

        latch.countDown();
    }

}
