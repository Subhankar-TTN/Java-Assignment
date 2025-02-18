package com.java.company.MultiThreading2;

//Q1)WAP to show usage of Callable and demonstrate how it is different from Runnable

import java.util.concurrent.*;

public class Question1 {

    public static void main(String[] args) {
        // Runnable Task
        Runnable runnableTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Task - No result, no exception handling.");
            }
        };

        // Callable Task
        Callable<Integer> callableTask = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Callable Task - Returns result and handles exception.");
                return 42;
            }
        };

        // Using Runnable with ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(runnableTask);

        // Using Callable with ExecutorService
        Future<Integer> future = executorService.submit(callableTask);
        try {
            Integer result = future.get();
            System.out.println("Callable Task Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}

