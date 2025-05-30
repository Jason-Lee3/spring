package org.example;

class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runCar(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS");
        runCar(ferrari);

        Car tesla = new ElectricCar("Tesla Model Y");
        runCar(tesla);
        
        Car crv = new HybridCar(" Honda CRV 2024");
        runCar(crv);
    }

    public static void runCar(Car car) {
        car.startEngine();
        car.drive();
    }
}