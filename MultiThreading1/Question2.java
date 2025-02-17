package com.java.company.MultiThreading1;

//Q2)Use Synchronize method and synchronize block to enable synchronization between multiple threads trying to access method at same time.

class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
    }

    // Synchronized block method (fine-grained synchronization)
    public void incrementUsingBlock() {
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
        }
    }

    public int getCount() {
        return count;
    }
}

public class Question2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Using synchronized method
        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Using synchronized block
        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                counter.incrementUsingBlock();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Create threads
        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");

        // Start threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}

