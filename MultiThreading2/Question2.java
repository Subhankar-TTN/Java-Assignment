package com.java.company.MultiThreading2;

//Q2)Improve the code written in Basics of Multi Threading Part 1 exercise question 4 to handle the deadlock using reentract lock.

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Question2 {

    // Declare ReentrantLock objects for resources
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());

        thread1.start();
        thread2.start();
    }

    static class Task1 implements Runnable {
        public void run() {
            boolean acquiredLock1 = false;
            boolean acquiredLock2 = false;

            try {
                while (!acquiredLock1 || !acquiredLock2) {
                    acquiredLock1 = lock1.tryLock();
                    if (acquiredLock1) {
                        System.out.println("Thread 1 locked resource 1");
                    }

                    if (acquiredLock1) {
                        acquiredLock2 = lock2.tryLock();
                        if (acquiredLock2) {
                            System.out.println("Thread 1 locked resource 2");
                        } else {
                            lock1.unlock();
                            System.out.println("Thread 1 released resource 1, retrying...");
                            acquiredLock1 = false;
                        }
                    }

                    // Sleep before retrying
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                }

            } finally {
                if (acquiredLock1) {
                    lock1.unlock();
                }
                if (acquiredLock2) {
                    lock2.unlock();
                }
            }
        }
    }

    // Task2 that tries to acquire lock2 then lock1
    static class Task2 implements Runnable {
        public void run() {
            boolean acquiredLock1 = false;
            boolean acquiredLock2 = false;

            try {
                while (!acquiredLock1 || !acquiredLock2) {
                    acquiredLock2 = lock2.tryLock();
                    if (acquiredLock2) {
                        System.out.println("Thread 2 locked resource 2");
                    }

                    if (acquiredLock2) {
                        acquiredLock1 = lock1.tryLock();
                        if (acquiredLock1) {
                            System.out.println("Thread 2 locked resource 1");
                        } else {
                            lock2.unlock();
                            System.out.println("Thread 2 released resource 2, retrying...");
                            acquiredLock2 = false;
                        }
                    }

                    // Sleep before retrying
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                }

            } finally {
                if (acquiredLock2) {
                    lock2.unlock();
                }
                if (acquiredLock1) {
                    lock1.unlock();
                }
            }
        }
    }
}

