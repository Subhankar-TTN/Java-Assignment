package com.java.company.MultiThreading1;

//Q3)WAP to showcase the usage of volatile in java.


class Counter2 {

    private volatile int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        Counter2 counter = new Counter2();

        // Thread to increment the counter
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Thread to monitor the counter's value
        Runnable monitorTask = () -> {
            int previousValue = counter.getCount();
            while (previousValue < 1000) {
                if (counter.getCount() != previousValue) {
                    System.out.println("Counter value changed: " + counter.getCount());
                    previousValue = counter.getCount();
                }
            }
            System.out.println("Final counter value: " + counter.getCount());
        };


        Thread thread1 = new Thread(incrementTask, "Increment-Thread");
        Thread thread2 = new Thread(monitorTask, "Monitor-Thread");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
