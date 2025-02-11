package com.java.company.Java8.Part2;

import java.util.Objects;
import java.util.*;
import java.util.stream.Collectors;

 class Employee {
    String fullName;
    Long salary;
    String city;

    // Constructor
    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public Long getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}

public class Question5 {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Shubham Agarwal", 4500L, "Delhi"),
                new Employee("Ravi Bishnoi", 6000L, "Delhi"),
                new Employee("Pawan Negi", 3000L, "Delhi"),
                new Employee("David Beckham", 4000L, "Mumbai"),
                new Employee("Shruti Roy", 3500L, "Delhi"),
                new Employee("Shreya Das", 5000L, "Delhi"),
                new Employee("Virat Kohli", 2500L, "Delhi")
        );

        // Get unique first names of employees whose salary is less than 5000 and who live in Delhi
        Set<String> uniqueFirstNames = employees.stream()
                .filter(e -> e.getSalary() < 5000 && "Delhi".equals(e.getCity())) // Filter by salary and city
                .map(e -> e.getFullName().split(" ")[0]) // Get the first name
                .collect(Collectors.toSet()); // Collect into a set for uniqueness

        // Output the result
        System.out.println("Unique first names: " + uniqueFirstNames);
    }
}

