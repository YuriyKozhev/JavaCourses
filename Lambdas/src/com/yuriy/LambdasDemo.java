package com.yuriy;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasDemo {
    public static void show() {
        // "key:value" -> "key=value" -> "{key=value}"
        Function<String, String> replaceColon = str -> str.replace(':','=');
        Function<String, String> addBraces = str -> "{" + str + "}";

        System.out.println(replaceColon
                .andThen(addBraces)
                .apply("key:value"));

        System.out.println(addBraces
                .compose(replaceColon)
                .apply("key:value"));
    }
}
