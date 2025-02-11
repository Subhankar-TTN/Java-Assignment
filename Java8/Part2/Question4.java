package com.java.company.Java8.Part2;

import java.util.Optional;

public class Question4 {

    // Method that returns an Optional object
    public static Optional<String> getName(boolean isPresent) {
        if (isPresent) {
            return Optional.of("Subhankar");
        } else {
            return Optional.empty();
        }
    }

    // Method to handle optional and print the value if present
    public static void handleOptional(Optional<String> optionalName) {
        // Check if a value is present in the Optional
        if (optionalName.isPresent()) {
            System.out.println("Name: " + optionalName.get());
        } else {
            System.out.println("Name is not present.");
        }
    }

    // Method to use orElse to provide a default value when Optional is empty
    public static void printNameOrDefault(Optional<String> optionalName) {
        String name = optionalName.orElse("Default Name");
        System.out.println("Name: " + name);
    }

    // Method to use ifPresent to execute an action if the value is present
    public static void printNameIfPresent(Optional<String> optionalName) {
        optionalName.ifPresent(name -> System.out.println("Hello, " + name + "!"));
    }

    public static void main(String[] args) {

        // Case 1: Optional with value
        Optional<String> nameOptional = getName(true);
        handleOptional(nameOptional);
        printNameOrDefault(nameOptional);
        printNameIfPresent(nameOptional);

        // Case 2: Optional with no value (empty)
        Optional<String> emptyOptional = getName(false);
        handleOptional(emptyOptional);
        printNameOrDefault(emptyOptional);
        printNameIfPresent(emptyOptional);
    }
}
