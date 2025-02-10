package com.java.company.Java8;

@FunctionalInterface
interface PersonFactory {
    Person createPerson(String name, int age);
}

class Person {
    private String name;
    private int age;

    // Constructor for the Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Question4 {
    public static void main(String[] args) {
        // Constructor reference to create a new Person object
        PersonFactory factory = Person::new;

        // Using the factory to create a Person instance
        Person person = factory.createPerson("Jasprit Bumrah", 29);

        // Displaying the details of the created person
        person.displayDetails();
    }
}

