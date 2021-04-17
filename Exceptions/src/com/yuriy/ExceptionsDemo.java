package com.yuriy;


import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException {
        Account account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("perform logging...");
            throw e;
        }
    }

}
