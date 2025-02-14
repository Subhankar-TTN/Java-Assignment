package com.java.company.BeyondJava8Part2;

import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        // Using Deque (LinkedList) for operations at both ends (add/remove first/last, get first/last)
        Deque<String> deque = new LinkedList<>();

        // Demonstrating addFirst() and addLast()
        deque.addFirst("First");
        deque.addLast("Last");
        deque.addLast("Middle");

        System.out.println("Deque after addFirst and addLast:");
        System.out.println(deque);

        // Demonstrating getFirst() and getLast()
        System.out.println("First Element: " + deque.getFirst());
        System.out.println("Last Element: " + deque.getLast());

        // Demonstrating removeFirst() and removeLast()
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removeFirst and removeLast:");
        System.out.println(deque);

        // Demonstrating reversed() - Creating a reversed list
        List<String> reversedList = new ArrayList<>(deque);
        Collections.reverse(reversedList);
        System.out.println("Reversed List: " + reversedList);

        // Using List for similar operations
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Last");
        list.add("Middle");

        System.out.println("List after add operations:");
        System.out.println(list);

        // Get first and last from List
        System.out.println("First Element in List: " + list.get(0));
        System.out.println("Last Element in List: " + list.get(list.size() - 1));
    }
}

