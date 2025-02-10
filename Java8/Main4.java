package com.java.company.Java8;

@FunctionalInterface
interface ConvertToUpperCase {
    String toUpperCase(String str);
}

public class Main4 {
    public static void main(String[] args) {
        // Lambda Expression
        ConvertToUpperCase toUpper = (str) -> str.toUpperCase();

        // Test the lambda
        System.out.println(toUpper.toUpperCase("hello"));  // Output: HELLO
    }
}

