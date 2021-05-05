package com.yuriy;

public class DownloadFileTask implements Runnable {
    private final DownloadStatus downloadStatus;

    public DownloadFileTask(DownloadStatus downloadStatus) {
        this.downloadStatus = downloadStatus;
    }

    @Override
    public void run() {
        System.out.println("Started downloading a file in thread: " + Thread.currentThread().getName());

        for (int i = 0; i < 100_000; i++) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Downloading is cancelled");
                return;
            }
            downloadStatus.incrementTotalBytes();
        }
        System.out.println("Download complete in thread: " + Thread.currentThread().getName());
        downloadStatus.done();
        synchronized (downloadStatus) {
            downloadStatus.notifyAll();
        }
    }
}
