package com.yuriy;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }

    public static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    }

    public static CompletableFuture<String> getPlaylistAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playlist");
    }

    public static void show() {
        getUserEmailAsync()
                .thenCompose(CompletableFutureDemo::getPlaylistAsync)
                .thenAccept(System.out::println);

    }
}
