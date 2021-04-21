package com.yuriy;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        Stream.iterate(2, n -> n * n)
                .limit(6)
                .forEach(System.out::println);

        Stream.iterate(2L, n -> n * n)
                .limit(6)
                .forEach(System.out::println);

    }
}
