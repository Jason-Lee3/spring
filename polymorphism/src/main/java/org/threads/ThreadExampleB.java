package org.threads;

public class ThreadExampleB {
    public static void main(String[] args) {
        ThreadExample myThread = new ThreadExample();
        myThread.start();

        while (myThread.count != 5) {
            try {
                Thread.sleep(250);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
