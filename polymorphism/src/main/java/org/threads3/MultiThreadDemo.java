package org.threads3;

public class MultiThreadDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(() -> task("Task 1"));
        Thread t2 = new Thread(() -> task("Task 2"));

        t1.start();
        t2.start();

        try {
            t1.join();  // Wait for t1 to finish
            t2.join();  // Wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime) + " ms");
    }

    static void task(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " - step " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}