package org.example.multithreading.solutions;

import org.example.multithreading.Solution;
import org.example.multithreading.tasks.FirstTask;
import org.example.multithreading.tasks.SecondTask;
import org.example.multithreading.tasks.ThirdTask;

public abstract class AbstractSolution implements Solution {
    protected final Runnable[] tasks;

    public AbstractSolution() {
        tasks = new Runnable[]{
                new FirstTask(),
                new SecondTask(),
                new ThirdTask()
        };
    }

}
