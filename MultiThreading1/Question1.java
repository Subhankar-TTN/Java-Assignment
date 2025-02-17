package com.java.company.MultiThreading1;

//Q1) Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep and join methods in the created threads.

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " started.");
            Thread.sleep(2000); // Sleep for 2 seconds
            System.out.println(Thread.currentThread().getName() + " finished sleeping.");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Question1 {
    public static void main(String[] args) throws InterruptedException {
        // Creating a Runnable object
        MyRunnable myRunnable = new MyRunnable();

        // Creating a Thread using the Runnable
        Thread thread1 = new Thread(myRunnable, "Thread-1");

        // Start the thread
        thread1.start();

        // Wait for thread1 to finish
        thread1.join();

        System.out.println("Thread-1 has finished execution.");

        // Create and run another thread directly from Thread class (example without Runnable)
        Thread thread2 = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " started.");
                Thread.sleep(1000); // Sleep for 1 second
                System.out.println(Thread.currentThread().getName() + " finished sleeping.");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }, "Thread-2");

        thread2.start();

        // Wait for thread2 to finish
        thread2.join();

        System.out.println("Thread-2 has finished execution.");
    }
}

