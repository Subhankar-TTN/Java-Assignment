package com.java.company.BeyondJava8;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Question3 {
    public static void main(String[] args) {
        // Creating an immutable List
        List<String> fruits = List.of("Apple", "Banana", "Cherry");

        System.out.println("Accessing the elements from the list : ");
        // Accessing elements
        fruits.forEach(System.out::println);


        // Creating an immutable Set
        Set<String> colors = Set.of("Red", "Green", "Blue");

        System.out.println("Accessing the elements from the Set: ");
        // Accessing elements
        colors.forEach(System.out::println);


        // Creating an immutable Map
        Map<String, Integer> phoneBook = Map.of(
                "Ashish", 12345,
                "Nitin Kumar", 67890,
                "Raju Rastogi", 11223
        );

        System.out.println("Accessing the elements from the map : ");
        // Accessing elements
        phoneBook.forEach((name, number) -> System.out.println(name + ": " + number));

    }
}

