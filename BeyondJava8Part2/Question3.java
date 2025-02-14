package com.java.company.BeyondJava8Part2;

// Define the Student record
 record Student3(int id, String name, String standard) {
    // No need to explicitly write equals() or hashCode() - they are automatically generated
}

public class Question3 {
    public static void main(String[] args) {
        // Create two student records with the same data
        Student3 student1 = new Student3(1, "Allu Arjun", "10th Grade");
        Student3 student2 = new Student3(1, "Allu Arjun", "10th Grade");

        // Check equality
        System.out.println("Are student1 and student2 equal? " + "\n" + student1.equals(student2));

        // Print hash codes
        System.out.println("HashCode of student1: " + student1.hashCode());
        System.out.println("HashCode of student2: " + student2.hashCode());
    }
}

