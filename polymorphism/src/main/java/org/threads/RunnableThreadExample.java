package org.threads;

public class RunnableThreadExample implements Runnable {
    public int count = 0;

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

    public static void main(String[] args) {
        RunnableThreadExample threadExample = new RunnableThreadExample();
        Thread thread = new Thread(threadExample);
        thread.start();

        while (threadExample.count != 5) {
            try {
                Thread.sleep(250);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
