package com.java.company.date5;

public class Employee implements Comparable<Employee> {
    private Double age;
    private Double salary;
    private String firstName;
    private String lastName;

    // Constructor
    public Employee(String firstName, String lastName, Double age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    // Default sorting based on firstName and lastName
    @Override
    public int compareTo(Employee other) {
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison == 0) {
            return this.firstName.compareTo(other.firstName);
        }
        return lastNameComparison;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | Age: " + age + " | Salary: " + salary;
    }
}

