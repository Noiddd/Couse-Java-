package com.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes(){
        return totalBytes;
    }

    public void incrementTotalBytes(){
            totalBytes++;
    }
}
