package com.yuriy;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        MailService service = new MailService();
        service.sendAsync();
        System.out.println("Continue");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
