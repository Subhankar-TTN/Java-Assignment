package com.java.company.BeyondJava8Part2;

 record Student(int id, String name, String standard) {
    // No need to explicitly write constructor, getter, or setter methods
    // as the record automatically provides them.
}

public class Question1 {
    public static void main(String[] args) {
        // Create a student record
        Student student1 = new Student(10," Subhankar Kanrar","12th");

        // Display the student's information
        System.out.println(student1);
    }
}
