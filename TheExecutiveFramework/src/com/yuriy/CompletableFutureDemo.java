package com.yuriy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    public static void show() {
        Supplier<Integer> supplier = () -> 1;
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(supplier);
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
