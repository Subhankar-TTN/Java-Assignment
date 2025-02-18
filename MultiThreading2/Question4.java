package com.java.company.MultiThreading2;

//Q4) WAP to return a random integer value from a thread execution using Future.

import java.util.concurrent.*;
import java.util.Random;

public class Question4 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                int randomNumber = random.nextInt(100);
                System.out.println("Generated random number: " + randomNumber);
                return randomNumber;
            }
        });

        // Get the result from the Future
        Integer result = future.get();
        System.out.println("Random number returned from the task: " + result);

        executorService.shutdown();
    }
}


