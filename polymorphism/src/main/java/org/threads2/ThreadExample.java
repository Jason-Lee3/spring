package org.threads2;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        thread1.start();

        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        thread2.start();

        System.out.println("Main thread continues...");
    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // Simulate some task that takes time
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread " + name + " is running...");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + name + " finished.");
    }
}