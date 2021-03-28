package com.example.javacoding.AQS;

import java.util.ArrayDeque;
import java.util.Queue;

public class ThreadLocalDemo {
    public static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static void main(String[] args) throws Exception {
        new ThreadLocalDemo().threadLocalTest();
    }

    public void threadLocalTest() throws Exception{

    }
}
