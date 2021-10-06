package org.example.multithreading.tasks;

public abstract class AbstractTask implements Runnable {

    final String MESSAGE;

    public AbstractTask(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    @Override
    public void run() {

        System.out.println(MESSAGE + " start");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(MESSAGE + " done");
    }
}
