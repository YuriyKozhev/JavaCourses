package com.yuriy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the data...");
            throw new IllegalStateException();
        });

        try {
            var result = future.exceptionally(ex -> 1).get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
