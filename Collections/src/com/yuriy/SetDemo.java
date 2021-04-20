package com.yuriy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void show() {
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        set1.retainAll(set2);
        System.out.println(set1);
    }
}
