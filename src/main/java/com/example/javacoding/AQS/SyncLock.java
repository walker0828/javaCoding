package com.example.javacoding.AQS;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class SyncLock {
    private final Sync sync;

    public SyncLock() {
        this.sync = new Sync();
    }

    public void lock() {

    }

    private static class Sync extends AbstractQueuedSynchronizer {

    }
}
