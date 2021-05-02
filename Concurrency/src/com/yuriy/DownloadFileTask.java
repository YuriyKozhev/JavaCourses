package com.yuriy;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Started downloading a file in thread: " + Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download complete in thread: " + Thread.currentThread().getName());
    }
}
