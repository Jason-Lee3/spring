package org.example;

public class Car {
    private String description;

    public Car() {

    }

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Starting Engine...");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
    }
    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }
}
