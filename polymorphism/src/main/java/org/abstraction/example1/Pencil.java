package org.abstraction.example1;

public class Pencil extends ProductForSale {

    public Pencil(String type, double price, String descprtion) {
        super(type, price, descprtion);
    }

    @Override
    public void showDetails() {

        System.out.println("This " + type + " is a pencil");
        System.out.printf("The price of the pencil is $%6.2f %n", price);
        System.out.println(description);
    }
}
