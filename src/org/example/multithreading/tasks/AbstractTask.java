package org.example.multithreading.tasks;

public abstract class AbstractTask implements Runnable {

    final String MESSAGE;

    public AbstractTask(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    @Override
    public void run() {

        System.out.println(MESSAGE);
    }
}
