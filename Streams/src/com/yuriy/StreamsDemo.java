package com.yuriy;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 20),
                new Movie("b",15),
                new Movie("c",10)
        );

        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;

        movies.stream()
                .filter(isPopular)
                .forEach(movie -> System.out.println(movie.getTitle()));
    }
}
