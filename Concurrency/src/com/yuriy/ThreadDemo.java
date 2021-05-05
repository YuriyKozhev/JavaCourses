package com.yuriy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ThreadDemo {
    public static void show() {
        Collection<Integer> collection =
                Collections.synchronizedCollection(new ArrayList<>());

        var thread1 = new Thread(() -> {
            collection.addAll(Arrays.asList(1, 2));
        });

        var thread2 = new Thread(() -> {
            collection.addAll(Arrays.asList(3, 4));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(collection);
    }
}
