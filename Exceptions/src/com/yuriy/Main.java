package com.yuriy;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable e) {
            System.out.println("An error occurred");
        }
    }
}
