package com.java.company.Java8.Part2;

import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(1, 2, 6, 8, 3, 10, 4, 7,15,20,0,5,14);

        // Sum all numbers greater than 5 using streams
        int sum = numbers.stream()
                .filter(number -> number > 5)  // Filtering numbers greater than 5
                .mapToInt(Integer::intValue)   // Converting to primitive int
                .sum();                        // Calculating Sum of the numbers

        // Output of the result
        System.out.println("Sum of numbers greater than 5: " + sum);
    }
}
