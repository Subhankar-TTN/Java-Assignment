package com.java.company.BeyondJava8Part2;

 record Student2(int id, String name, String standard) {

    // Custom constructor to validate non-null values
    public Student2 {
        // Validate that 'name' and 'standard' are not null
        if (name == null || standard == null) {
            throw new IllegalArgumentException("Name and standard cannot be null");
        }
    }
}

public class Question2{
    public static void main(String[] args) {
        try {
            // Create a student record with valid data
            Student2 student1 = new Student2(1, "Rohit Sharma", "10th Grade");
            System.out.println(student1);

            // Attempt to create a student record with a null name (will throw exception)
            Student2 student2 = new Student2(2, null, "9th Grade");
            System.out.println(student2);
        } catch (IllegalArgumentException e) {
            // Catch and print exception if invalid data is provided
            System.out.println("Error: " + e.getMessage());
        }
    }
}
