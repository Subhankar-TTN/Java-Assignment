package com.java.company.MultiThreading1;

//Q4)Write a code to simulate a deadlock in java

class Resource {
    // A simple resource class representing a lockable resource
}

public class Question4 {
    // Creating two resources
    static Resource resource1 = new Resource();
    static Resource resource2 = new Resource();

    public static void main(String[] args) {
        // Thread 1 tries to lock resource1, then resource2
        Runnable task1 = () -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " locked resource1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " locked resource2");
                }
            }
        };

        Runnable task2 = () -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " locked resource2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + " locked resource1");
                }
            }
        };

        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");

        thread1.start();
        thread2.start();
    }
}

