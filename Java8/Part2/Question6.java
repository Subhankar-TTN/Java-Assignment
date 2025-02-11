package com.java.company.Java8.Part2;

//Task 1: Compare Two Dates

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Input: First Date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateString = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateString, formatter);

        // Input: Second Date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateString = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateString, formatter);

        // Compare the two dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date occurs before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date occurs after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }

        scanner.close();
    }
}



