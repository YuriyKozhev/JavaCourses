package com.yuriy;

import java.util.ArrayList;

public class ThreadDemo {
    public static void show() {
        System.out.println("Current thread: " + Thread.currentThread().getName());

        DownloadStatus downloadStatus = new DownloadStatus();

        ArrayList<Thread> threads = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask(downloadStatus));
            thread.start();
            threads.add(thread);
        }

        for (var thread:
             threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(downloadStatus.getTotalBytes());

    }
}
