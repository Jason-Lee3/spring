package org.example;

public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinder;

    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void drive() {
        System.out.println("Car -> driving, type is" + getClass().getSimpleName());
    }
}
