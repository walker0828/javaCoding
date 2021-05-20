package com.example.javacoding.multiThread.threads.taskCallable;

import org.springframework.core.task.TaskExecutor;

public class TaskCallableTest {
    public static void main(String[] args) {
        TaskCallable<TaskResult> taskCallable = new TaskHandler();
        TaskExecutor taskExecutor = new TaskExecutor(taskCallable,"test");
        new Thread(taskExecutor).start();
    }
}
