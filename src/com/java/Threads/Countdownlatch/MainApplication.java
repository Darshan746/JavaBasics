package com.java.Threads.Countdownlatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainApplication
{

    public static void main(String args[]) throws InterruptedException
    {
        // USING EXECUTOR framework

        List<MarkerInter> list = new ArrayList<>();
        CountDownLatch latch = new CountDownLatch(2);
        list.add(new CacheService(latch));
        list.add(new AlertService(latch));

        Executor executor = Executors.newFixedThreadPool(list.size());

        for (MarkerInter inter : list)
        {
            executor.execute((Runnable) inter);
        }
        latch.await();
        System.out.println("Main Thread Continues\n");

        System.out.println("Trying in Other Way Using Normal Thread Call");

        // Normal Thread t.start
        CountDownLatch latch2 = new CountDownLatch(2);
        Thread cacheService = new Thread(new CacheService(latch2));
        Thread alertService = new Thread(new AlertService(latch2));

        cacheService.start(); // separate thread will initialize CacheService
        alertService.start(); // another thread for AlertService initialization

        // application should not start processing any thread until all service is up
        // and ready to do there job.
        // Countdown latch is idle choice here, main thread will start with count 2
        // and wait until count reaches zero. each thread once up and read will do
        // a count down. this will ensure that main thread is not started processing
        // until all services is up.

        // count is 2 since we have 2 Threads (Services)

        try
        {
            latch2.await(); // main thread is waiting on CountDownLatch to finish
            System.out.println("All services are up, Application is starting now");
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

    }
}
