package com.yuriy;

import java.util.List;

public class LambdasDemo {
    public static void show() {
        List<Integer> list = List.of(1, 2, 3);

        // Imperative style
        for (var item: list) {
            System.out.println(item);
        }

        // Declarative style
        list.forEach(System.out::println);
    }
}
