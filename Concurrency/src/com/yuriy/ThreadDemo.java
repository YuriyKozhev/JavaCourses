package com.yuriy;

import java.util.ArrayList;

public class ThreadDemo {
    public static void show() {
        System.out.println("Current thread: " + Thread.currentThread().getName());

        DownloadStatus downloadStatus = new DownloadStatus();

        ArrayList<Thread> threads = new ArrayList<>(10);

        for (int i = 0; i < 1; i++) {
            Thread thread = new Thread(new DownloadFileTask(downloadStatus));
            thread.start();
            threads.add(thread);
        }

        new Thread(() -> {
           while (!downloadStatus.isDone()) {};
           System.out.println("Downloading is done");
        }).start();

    }
}
