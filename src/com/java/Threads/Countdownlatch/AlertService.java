package com.java.Threads.Countdownlatch;

import java.util.concurrent.CountDownLatch;

public class AlertService implements Runnable, MarkerInter
{

    private final CountDownLatch latch;

    public AlertService(CountDownLatch latch)
    {
        this.latch = latch;
    }

    @Override
    public void run()
    {
        System.out.println("Alert Service is up and Running");

        latch.countDown();
    }

}
