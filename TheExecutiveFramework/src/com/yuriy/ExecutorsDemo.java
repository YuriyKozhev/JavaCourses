package com.yuriy;

import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        var executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        executor.shutdown();
    }
}
