package com.yuriy;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a file in thread: " + Thread.currentThread().getName());
    }
}
