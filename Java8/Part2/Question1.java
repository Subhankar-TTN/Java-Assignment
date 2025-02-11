package com.java.company.Java8.Part2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question1 {
    public static void main(String[] args) {
        // Consumer example - prints a message with the given name
        Consumer<String> greetConsumer = name -> System.out.println("Hello, " + name);
        greetConsumer.accept("Amit");

        // Supplier example - supplies a random number
        Supplier<Double> randomNumberSupplier = Math::random;
        System.out.println("Random number: " + randomNumberSupplier.get());

        // Predicate example - checks if a number is even
        Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + "\n" + isEvenPredicate.test(4));
        System.out.println("Is 5 even? " + "\n" + isEvenPredicate.test(5));

        // Function example - square a number
        Function<Integer, Integer> squareFunction = number -> number * number;
        System.out.println("Square of 5: " + squareFunction.apply(5));

    }
}

