package com.yuriy;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        Stream.generate(() -> Math.random())
                .limit(10)
                .forEach(System.out::println);
    }
}
