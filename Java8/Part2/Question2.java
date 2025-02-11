package com.java.company.Java8.Part2;

// Interface with a default method and a static method
interface MyInterface {

    // Default method (can be overridden)
    default void defaultMethod() {
        System.out.println("This is the default method of the interface.");
    }

    // Static method (cannot be overridden)
    static void staticMethod() {
        System.out.println("This is the static method of the interface.");
    }

    // Abstract method (to be implemented by implementing classes)
    void abstractMethod();
}

// Class implementing the interface
class MyClass implements MyInterface {

    @Override
    public void abstractMethod() {
        System.out.println("Implementing the abstract method.");
    }
}

public class Question2 {
    public static void main(String[] args) {

        // Creating an instance of the class implementing the interface
        MyClass myObject = new MyClass();

        // Accessing the default method through the instance
        myObject.defaultMethod();

        // Accessing the static method through the interface
        MyInterface.staticMethod();

        // Calling the abstract method implemented in the class
        myObject.abstractMethod();
    }
}

