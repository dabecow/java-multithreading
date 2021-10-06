package org.example.multithreading;

import org.example.multithreading.solutions.BasicExecutorSolution;
import org.example.multithreading.solutions.FixedThreadPoolSolution;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Solution solution = new FixedThreadPoolSolution();
        solution.solve();
    }
}
