package com.yuriy;

public class LambdasDemo {
    public LambdasDemo(String message) {

    }

    public static void show() {
        greet(LambdasDemo::new);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
