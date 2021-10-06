package org.example.multithreading.solutions;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolSolution extends AbstractSolution{

    @Override
    public void solve() throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (Runnable task : tasks) {
            executor.submit(task);
            Thread.sleep(MAGIC_WAITING_NUMBER);
        }
        executor.shutdown();
    }
}
