package com.java.company.MultiThreading2;

//Q5)WAP to showcase the difference between shutdown() and shutdownNow().

import java.util.concurrent.*;

public class Question5 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Creating tasks
        Runnable task1 = createTask("Task 1");
        Runnable task2 = createTask("Task 2");
        Runnable task3 = createTask("Task 3");
        Runnable task4 = createTask("Task 4");

        // Submitting tasks to the executor
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);

        Thread.sleep(1000);

        // Calling shutdown() - no new tasks will be accepted, but executing tasks will finish
        System.out.println("\nCalling shutdown():");
        executorService.shutdown();

        // Wait a bit to observe the effect of shutdown
        Thread.sleep(2000);
        System.out.println("Executor service is shut down: " + executorService.isShutdown());

        // Create a new executor service to demonstrate shutdownNow()
        executorService = Executors.newFixedThreadPool(2);

        // Submitting tasks again
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);

        Thread.sleep(1000);

        // Calling shutdownNow() - attempts to stop all executing tasks immediately
        System.out.println("\nCalling shutdownNow():");
        System.out.println("Pending tasks: " + executorService.shutdownNow());

        // Wait a bit to observe the effect of shutdownNow
        Thread.sleep(2000);
        System.out.println("Executor service is shut down: " + executorService.isShutdown());
    }

    private static Runnable createTask(String taskName) {
        return () -> {
            System.out.println(taskName + " is starting");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted");
            }
            System.out.println(taskName + " is completed");
        };
    }
}

