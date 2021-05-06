package com.yuriy;

public class MailService {
    public void send() {
        System.out.println("Starting sending mail...");
        LongTask.simulate();
        System.out.println("Mail was sent");
    }
}
