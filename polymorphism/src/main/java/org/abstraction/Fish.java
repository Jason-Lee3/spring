package org.abstraction;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("fast")) {
            System.out.println(getExplicitType() + " swimming");
        } else {
            System.out.println(getExplicitType() + " darting frantically");
        }
    }

    @Override
    public void makeNoise() {
        if (type.equals("Goldfish")) {
            System.out.print("swish ");
        } else {
            System.out.print("Splash! ");
        }
    }
}
