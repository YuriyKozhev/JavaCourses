package com.yuriy;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private final LongAdder totalBytes = new LongAdder();

    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public void incrementTotalBytes() {
        totalBytes.increment();
    }
}
