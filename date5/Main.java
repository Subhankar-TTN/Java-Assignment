package com.java.company.date5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Doe", 28.0, 50000.0));
        employees.add(new Employee("Jane", "Doe", 25.0, 55000.0));
        employees.add(new Employee("Alice", "Smith", 30.0, 70000.0));
        employees.add(new Employee("Bob", "Johnson", 35.0, 45000.0));
        employees.add(new Employee("Eve", "White", 40.0, 80000.0));

        // Sort employees by default sorting (first name and last name)
        Collections.sort(employees);
        System.out.println("Employees sorted by Name (Default Sorting):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sort employees by salary using Comparator
        Collections.sort(employees, new SalaryComparator());
        System.out.println("\nEmployees sorted by Salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

