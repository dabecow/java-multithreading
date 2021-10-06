package org.example.multithreading.solutions;

import java.util.concurrent.Executor;

public class BasicExecutorSolution extends AbstractSolution {

    @Override
    public void solve() throws InterruptedException {

        for (Runnable task : tasks) {
            Executor executor = command -> new Thread(command).start();
            Thread.sleep(MAGIC_WAITING_NUMBER);
            executor.execute(task);
        }
    }
}
