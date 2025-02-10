package com.java.company.Java8;

@FunctionalInterface
interface Increment {
    int incrementByOne(int a);
}

public class Main2 {
    public static void main(String[] args) {
        // Lambda Expression
        Increment increment = (a) -> a + 1;

        // Test the lambda
        System.out.println(increment.incrementByOne(5));  // Output: 6
    }
}

