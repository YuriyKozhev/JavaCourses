package com.yuriy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> 1);
        future.thenAcceptAsync((result) -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done " + result);
        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
