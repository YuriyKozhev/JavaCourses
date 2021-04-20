package com.yuriy;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("c");
        list.add(0, "a");

        System.out.println(list);
        System.out.println(list.subList(0, 2));
    }
}
