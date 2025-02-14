package com.java.company.BeyondJava8;

import java.util.*;
import java.util.stream.*;

public class Question4 {
    public static void main(String[] args) {
        // Create a Stream of elements
        Stream<String> stream = Stream.of("Apple", "Banana", "Cherry");

        // Collect the elements into an unmodifiable List
        List<String> unmodifiableList = Collections.unmodifiableList(
                stream.collect(Collectors.toList())
        );

        // Attempting to modify this list will throw an UnsupportedOperationException
        System.out.println("Here we are trying to modify the unmodifiable list -> ");
        try {
            unmodifiableList.add("Date");
        } catch (UnsupportedOperationException e) {
            System.out.println("Output: Cannot modify an unmodifiable list: " + e.getMessage());
        }

        // Print the unmodifiable list
        System.out.println("Printing the unmodifiable list : ");
        unmodifiableList.forEach(System.out::println);
    }
}

