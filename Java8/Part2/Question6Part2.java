package com.java.company.Java8.Part2;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

//Task 2: Print Current Date and Time in 3 Different Time Zones

public class Question6Part2 {
    public static void main(String[] args) {
        // Get the current date and time in the system default time zone
        ZonedDateTime now = ZonedDateTime.now();

        // Print current date and time in three different time zones
        printTimeInTimeZone(now, "Asia/Kolkata");   // India Standard Time (IST)
        printTimeInTimeZone(now, "America/New_York"); // Eastern Standard Time (EST)
        printTimeInTimeZone(now, "Europe/London");  // British Standard Time (BST)
    }

    // Helper method to print time in a specific time zone
    private static void printTimeInTimeZone(ZonedDateTime now, String timeZone) {
        ZonedDateTime timeInZone = now.withZoneSameInstant(java.time.ZoneId.of(timeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Time in " + timeZone + ": " + timeInZone.format(formatter));
    }
}

