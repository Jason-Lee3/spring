package org.threads3;

public class SingleThreadDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        task("Task 1");
        task("Task 2");

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
