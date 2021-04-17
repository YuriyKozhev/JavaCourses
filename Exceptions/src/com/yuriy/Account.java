package com.yuriy;

import java.io.IOException;

public class Account {
    private float deposit = 0;

    public void deposit(float value) throws IOException {
        if (value <= 0) {
            throw new IOException();
        }
    }

    public void withdraw(float value) throws AccountException {
        if (deposit < value) {
            throw new AccountException(new InsufficientFundsException());
        }
    }
}
