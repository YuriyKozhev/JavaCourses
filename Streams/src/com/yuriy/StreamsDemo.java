package com.yuriy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("b", 20, Genre.ACTION),
                new Movie("a",15, Genre.ACTION),
                new Movie("c",25, Genre.THRILLER),
                new Movie("a",15, Genre.COMEDY)
        );

        Map<Genre, List<Movie>> map = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));

        System.out.println(map);

    }
}
