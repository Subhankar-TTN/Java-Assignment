package com.java.company.MultiThreading2;

//Q3)Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool() to submit a list of tasks and wait for completion of all tasks.

import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.List;

public class Question3 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Runnable task1 = createTask("Task 1");
        Runnable task2 = createTask("Task 2");
        Runnable task3 = createTask("Task 3");
        Runnable task4 = createTask("Task 4");

        Runnable[] tasks = {task1, task2, task3, task4};

        System.out.println("Using SingleThreadExecutor:");
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        submitAndWaitForTasks(singleThreadExecutor, tasks);
        singleThreadExecutor.shutdown();

        System.out.println("\nUsing newCachedThreadPool:");
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        submitAndWaitForTasks(cachedThreadPool, tasks);
        cachedThreadPool.shutdown();

        System.out.println("\nUsing newFixedThreadPool:");
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
        submitAndWaitForTasks(fixedThreadPool, tasks);
        fixedThreadPool.shutdown();
    }

    private static Runnable createTask(String taskName) {
        return () -> {
            System.out.println(taskName + " is starting");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(taskName + " is completed");
        };
    }

    private static void submitAndWaitForTasks(ExecutorService executor, Runnable[] tasks) throws InterruptedException, ExecutionException {
        List<Future<?>> futures = new ArrayList<>();

        for (Runnable task : tasks) {
            futures.add(executor.submit(task));
        }

        for (Future<?> future : futures) {
            future.get();
        }

        System.out.println("All tasks are completed.\n");
    }
}

