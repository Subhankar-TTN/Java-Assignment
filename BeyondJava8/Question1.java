package com.java.company.BeyondJava8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Question1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");


        Iterator<String> iterator = list.iterator();

        Stream<String> stream = StreamSupport.stream(((Iterable<String>) () -> iterator).spliterator(), false);

        stream.forEach(System.out::println);
    }
}

