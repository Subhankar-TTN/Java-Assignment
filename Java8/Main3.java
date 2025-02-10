package com.java.company.Java8;

@FunctionalInterface
interface ConcatenateStrings {
    String concatenate(String a, String b);
}

public class Main3 {
    public static void main(String[] args) {
        // Lambda Expression
        ConcatenateStrings concat = (a, b) -> a + b;

        // Test the lambda
        System.out.println(concat.concatenate("Hello", " World"));  // Output: Hello World
    }
}

