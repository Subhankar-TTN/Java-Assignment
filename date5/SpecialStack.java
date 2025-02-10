package com.java.company.date5;

import java.util.Stack;

public class SpecialStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private int maxSize;

    // Constructor to initialize the stack and the min stack
    public SpecialStack(int size) {
        stack = new Stack<>();
        minStack = new Stack<>();
        maxSize = size;
    }

    // Push operation
    public void push(int value) {
        if (stack.size() == maxSize) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }

        stack.push(value);

        // If minStack is empty, push the current value as the minimum
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            // Push the minimum between the current value and the current minimum
            minStack.push(Math.min(value, minStack.peek()));
        }
    }

    // Pop operation
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }

        minStack.pop();
        return stack.pop();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Check if the stack is full
    public boolean isFull() {
        return stack.size() == maxSize;
    }

    // Get the minimum element from the stack
    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty. No minimum element.");
            return -1;
        }
        return minStack.peek(); // Top element of minStack is the minimum
    }
}
 class Main2 {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(5);
        stack.push(30);
        stack.push(15);

        System.out.println("Minimum Element: " + stack.getMin());

        stack.pop();
        System.out.println("Minimum Element after pop: " + stack.getMin());

        stack.pop();
        System.out.println("Minimum Element after another pop: " + stack.getMin());

        stack.pop();
        System.out.println("Minimum Element after pop: " + stack.getMin());

        stack.pop();
        System.out.println("Minimum Element after another pop: " + stack.getMin());

        stack.pop();
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}


