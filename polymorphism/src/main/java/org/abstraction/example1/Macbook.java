package org.abstraction.example1;

public class Macbook extends ProductForSale {
    public Macbook(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {

        System.out.println("This " + type + " is a macbook");
        System.out.printf("The price of the macbook is $%6.2f %n", price);
        System.out.println(description);
    }
}
