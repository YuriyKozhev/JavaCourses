package com.yuriy;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        MailService service = new MailService();
        service.send();
        System.out.println("Finished");
    }
}
