package com.yuriy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show() {
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        // similar to Python dict
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        // computation complexity ~ o(1)
        System.out.println(map.get("e1"));

        for (var entry :
                map.entrySet()) {
            System.out.println(entry.getKey() + ':' + entry.getValue());
        }
    }

}
