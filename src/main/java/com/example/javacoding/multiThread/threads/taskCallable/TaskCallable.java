package com.example.javacoding.multiThread.threads.taskCallable;

public interface TaskCallable<T> {
    T callable(T t);
}
