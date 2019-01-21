package com.java.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo
{

    public static void main(String[] args)
    {
        ExecutorService execService = Executors.newFixedThreadPool(2);

        execService.submit(new TaskOne());
        execService.submit(new TaskOne());
        execService.shutdown();

        //Suppose if you submit one more task after executorService shutdown  below exception would throw
        /**
         * java.util.concurrent.RejectedExecutionException
         */
        // execService.execute(new TaskOne());
    }

}