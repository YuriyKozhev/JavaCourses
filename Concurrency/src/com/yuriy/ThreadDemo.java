package com.yuriy;

public class ThreadDemo {
    public static void show() {
        System.out.println("Current thread: " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
