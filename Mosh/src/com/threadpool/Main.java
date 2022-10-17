package com.threadpool;

import java.util.concurrent.Executors;

class ExecutorsDemo {
    public static void show(){

    }
}

public class Main {
    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(2);

        try {
            executor.submit(()->{
                System.out.println(Thread.currentThread().getName());
            });
        } finally {
            executor.shutdown();
        }


    }
}
