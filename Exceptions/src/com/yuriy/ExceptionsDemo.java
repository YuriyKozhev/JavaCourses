package com.yuriy;


import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException {
        Account account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }

}
