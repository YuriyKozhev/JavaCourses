package com.yuriy;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("b", 20),
                new Movie("a",15),
                new Movie("c",25),
                new Movie("a",15)
        );

        Map<String, Integer> map = movies.stream()
                .filter(movie -> movie.getLikes() > 15)
                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));

        System.out.println(map);

    }
}
