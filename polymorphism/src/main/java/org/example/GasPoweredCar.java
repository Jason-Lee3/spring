package org.example;

public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void drive() {
        System.out.println("Car -> driving, type is" + getClass().getSimpleName());
    }
}
