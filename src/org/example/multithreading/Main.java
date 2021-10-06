package org.example.multithreading;

import org.example.multithreading.solutions.BasicExecutorSolution;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Solution solution = new BasicExecutorSolution();
        solution.solve();
    }
}
