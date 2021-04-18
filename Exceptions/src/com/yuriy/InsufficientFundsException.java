package com.yuriy;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient amount of money");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
