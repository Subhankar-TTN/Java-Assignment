package com.java.company.BeyondJava8;

import java.util.Optional;
import java.util.stream.Stream;

public class Question2 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

        Stream<String> stream = optional.stream();

        stream.forEach(System.out::println);

        Optional<String> emptyOptional = Optional.empty();
        Stream<String> emptyStream = emptyOptional.stream();

        emptyStream.forEach(System.out::println);
    }
}

