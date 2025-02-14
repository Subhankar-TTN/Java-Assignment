package com.java.company.BeyondJava8Part2;

import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        // Using TreeMap for NavigableMap functionality (supports firstEntry(), lastEntry(), etc.)
        NavigableMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");

        System.out.println("TreeMap (NavigableMap):");
        System.out.println(treeMap);

        // Demonstrating firstEntry() and lastEntry()
        System.out.println("First Entry: " + treeMap.firstEntry());
        System.out.println("Last Entry: " + treeMap.lastEntry());
        // Demonstrating pollFirstEntry() and pollLastEntry()
        System.out.println("Poll First Entry: " + treeMap.pollFirstEntry());
        System.out.println("Poll Last Entry: " + treeMap.pollLastEntry());

        System.out.println("TreeMap after poll operations:");
        System.out.println(treeMap);

        // Using LinkedHashMap to simulate the behavior of putting first and last (no direct method)
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(4, "Four");

        System.out.println("\nLinkedHashMap (SequencedMap):");
        System.out.println(linkedHashMap);

        // Simulating putFirst() by adding an element to the front of LinkedHashMap
        Map<Integer, String> tempMap = new LinkedHashMap<>();
        tempMap.put(0, "Zero");
        tempMap.putAll(linkedHashMap);

        System.out.println("LinkedHashMap after putFirst:");
        System.out.println(tempMap);
        // Simulating putLast() by adding an element to the end of LinkedHashMap
        linkedHashMap.put(5, "Five");
        System.out.println("LinkedHashMap after putLast:");
        System.out.println(linkedHashMap);
        // Simulating reversed() - Reversing the order using a list
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(linkedHashMap.entrySet());
        Collections.reverse(entryList);

        System.out.println("Reversed LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : entryList) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

