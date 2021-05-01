package com.yuriy;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("b", 20),
                new Movie("a",15),
                new Movie("c",25),
                new Movie("a",15)
        );

        movies.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
