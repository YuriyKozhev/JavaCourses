package com.yuriy;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send() {
        System.out.println("Starting sending mail...");
        LongTask.simulate();
        System.out.println("Mail was sent");
    }

    public CompletableFuture<Void> sendAsync() {
        return CompletableFuture.runAsync(this::send);
    }
}
