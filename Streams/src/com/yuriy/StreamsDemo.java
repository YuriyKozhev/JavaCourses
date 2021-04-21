package com.yuriy;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        int[] numbers = { 1, 2, 3};
        Arrays.stream(numbers)
                .forEach(num -> System.out.println(num));

    }
}
