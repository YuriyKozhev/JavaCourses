package com.yuriy;

public class LambdasDemo {
    public static void show() {
        greet(message -> System.out.println(message));

        Printer printer = message -> System.out.println(message);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
