package com.java.company.Java8;

interface InterfaceA {
    // Default method in InterfaceA
    default void displayA() {
        System.out.println("This is Interface A's default method.");
    }
}

interface InterfaceB {
    // Default method in InterfaceB
    default void displayB() {
        System.out.println("This is Interface B's default method.");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // You can optionally override default methods if needed
    @Override
    public void displayA() {
        System.out.println("Overridden method from Interface A.");
    }

    // You can optionally override default methods if needed
    @Override
    public void displayB() {
        System.out.println("Overridden method from Interface B.");
    }
}

public class Question3{
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass();

        // Access the methods from both interfaces
        obj.displayA();
        obj.displayB();
    }
}

