package org.threads;

public class MyClass extends Thread {
    private String name;
    private MyObject myObject;

    public MyClass(String name, MyObject myObject) {
        this.name = name;
        this.myObject = myObject;
    }

    public void run() {
        if (name.equals("1")) myObject.foo(name);
        else if (name.equals("2")) myObject.bar(name);
    }

}

