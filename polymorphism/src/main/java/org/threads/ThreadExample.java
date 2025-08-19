package org.threads;

public class ThreadExample extends Thread {
    int count = 0;

    public void run() {
        System.out.println("RunnableThread starting");

        try {
            while (count <= 5) {
                Thread.sleep(500);
                count++;
            }
        }
        catch (InterruptedException e) {
            System.out.println("RunnableThread interrupted.");
        }
        System.out.println("RunnableThread completed.");
    }
}
