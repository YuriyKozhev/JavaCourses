package com.yuriy;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Started downloading a file in thread: " + Thread.currentThread().getName());

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Downloading is cancelled");
                return;
            }
            System.out.println("downloading byte " + i);
        }

        System.out.println("Download complete in thread: " + Thread.currentThread().getName());
    }
}
