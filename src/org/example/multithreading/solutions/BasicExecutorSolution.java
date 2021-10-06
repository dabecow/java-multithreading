package org.example.multithreading.solutions;

import org.example.multithreading.Solution;
import org.example.multithreading.tasks.FirstTask;
import org.example.multithreading.tasks.SecondTask;
import org.example.multithreading.tasks.ThirdTask;

import java.util.concurrent.Executor;

public class BasicExecutorSolution implements Solution {

    private final Runnable[] tasks;

    public BasicExecutorSolution() {
        tasks = new Runnable[]{
                new FirstTask(),
                new SecondTask(),
                new ThirdTask()
        };
    }

    @Override
    public void solve() throws InterruptedException {

        for (Runnable task : tasks) {
            Executor executor = command -> new Thread(command).start();
            Thread.sleep(MAGIC_WAITING_NUMBER);
            executor.execute(task);
        }
    }
}
