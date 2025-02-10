package com.java.company.Java8;

@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}

class Calculator {

    // Instance method for addition
    public int add(int a, int b) {
        return a + b;
    }

    // Instance method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }
}

class MathOperations {

    // Static method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class Question2 {
    public static void main(String[] args) {
        // Create instance of Calculator
        Calculator calculator = new Calculator();

        // Instance method reference for addition
        Operation addOperation = calculator::add;
        System.out.println("Addition: " + addOperation.apply(10, 5));

        // Instance method reference for subtraction
        Operation subtractOperation = calculator::subtract;
        System.out.println("Subtraction: " + subtractOperation.apply(10, 5));

        // Static method reference for multiplication
        Operation multiplyOperation = MathOperations::multiply;
        System.out.println("Multiplication: " + multiplyOperation.apply(10, 5));
    }
}

