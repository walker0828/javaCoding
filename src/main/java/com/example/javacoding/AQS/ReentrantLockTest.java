package com.example.javacoding.AQS;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        lock.lock();
        try {

        } finally {
            lock.unlock();
        }
    }
}
