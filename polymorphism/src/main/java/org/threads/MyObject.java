package org.threads;

public class MyObject {
    public static synchronized void foo(String name) {
        try {
            System.out.println("Thread " + name + ".foo(): starting");
            Thread.sleep(3000);
            System.out.println("Thread " + name + ".foo(): ending");
        }
        catch (InterruptedException e) {
            System.out.println("Thread " + name + ": interrupted.");
        }
    }

    public static synchronized void bar(String name) {
        try {
            System.out.println("Thread " + name + ".bar(): starting");
            Thread.sleep(3000);
            System.out.println("Thread " + name + ".bar(): ending");
        }
        catch (InterruptedException e) {
            System.out.println("Thread " + name + ": interrupted.");
        }
    }


    public static void main(String[] args) {
        MyObject obj = new MyObject();
        MyClass thread1 = new MyClass("1", obj);
        MyClass thread2 = new MyClass("2", obj);
        thread1.start();
        thread2.start();
    }
}
