package com.yuriy;


import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        Account account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
