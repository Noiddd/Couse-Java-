package com.multithreading;

import java.util.ArrayList;
import java.util.List;

public class thread {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<Thread>();
        List<DownloadFileTask> tasks = new ArrayList<DownloadFileTask>();

        for (int i = 0; i < 10; i++) {
            DownloadFileTask task = new DownloadFileTask();
            tasks.add(task);

            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }

        for(Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        var totalBytes = tasks.stream().map(t->t.getStatus().getTotalBytes()).reduce(Integer::sum);

        System.out.println(totalBytes);

    }
}
