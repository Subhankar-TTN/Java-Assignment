package com.java.company.Java8;

@FunctionalInterface
interface CompareNumbers {
    boolean checkGreater(int a, int b);
}

public class Main1 {
    public static void main(String[] args) {
        // Lambda Expression
        CompareNumbers isGreater = (a, b) -> a > b;

        // Test the lambda
        System.out.println(isGreater.checkGreater(5, 3));  // Output: true
        System.out.println(isGreater.checkGreater(2, 7));  // Output: false
    }
}

