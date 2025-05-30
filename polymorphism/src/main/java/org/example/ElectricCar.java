package org.example;

public class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void drive() {
        System.out.println("Car -> driving, type is" + getClass().getSimpleName());
    }
}
