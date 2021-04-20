package com.yuriy;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasDemo {
    public static void show() {
        Function<String, Integer> map = str -> str.length();
        System.out.println(map.apply("you"));
    }
}
