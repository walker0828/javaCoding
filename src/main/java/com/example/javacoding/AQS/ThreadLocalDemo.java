package com.example.javacoding.AQS;

import java.util.ArrayDeque;
import java.util.Queue;

public class ThreadLocalDemo {
    public static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static void main(String[] args) throws Exception {
        new ThreadLocalDemo().threadLocalTest();
    }

    public void threadLocalTest() throws Exception{
        THREAD_LOCAL.set("Test-0");
        String v = THREAD_LOCAL.get();
        System.out.println("Thread 0线程执行之前，"+Thread.currentThread().getName()+ "线程取到的值" + v);

        new Thread(new Runnable() {
            @Override
            public void run() {
                String v = THREAD_LOCAL.get();
                System.out.println(Thread.currentThread().getName() + "线程收到的数" + v);
                
            }
        }).start();
    }
}
