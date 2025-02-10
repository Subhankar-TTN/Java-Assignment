package com.java.company;

public class Employee {

    // Fields (attributes)
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    // Default constructor (no arguments)
    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.designation = "";
    }

    // Constructor with all fields (parameters)
    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    // Constructor with first name, last name, and age (designation set to default)
    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = "Not Assigned";
    }

    // Setter methods to update fields
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Overridden toString method to display meaningful message
    @Override
    public String toString() {
        return "Employee Details:\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Designation: " + designation;
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create employee objects using different constructors
        Employee emp1 = new Employee("SubhanKar", "kanrar", 23, "Software Engineer");
        Employee emp2 = new Employee("Virat", "kohli", 25);

        // Display employee details using toString method
        System.out.println(emp1);
        System.out.println();
        System.out.println(emp2);

        // Update fields using setter methods
        emp2.setDesignation("Data Scientist");
        System.out.println("\nAfter updating designation:");
        System.out.println(emp2);
    }
}

