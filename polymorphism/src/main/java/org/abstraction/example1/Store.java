package org.abstraction.example1;

import java.util.ArrayList;

public class Store {
    // manage a list of products for sale, including displaying the product details
    // manage an order, which can just be a list of OrderItem objects
    // have methods to add an item to the order, and print the ordered items, so it looks like a sales receipt

    private static ArrayList<ProductForSale> productsForSale = new ArrayList<>();

    public static void main(String[] args) {
        productsForSale.add(new Pencil("AAA", 1, "Regular Triple A pencil"));
        productsForSale.add(new Macbook("Macbook Pro 16inch", 3000, "36GB RAM 512GB Storage"));

        listProducts();

        System.out.println("\nOrder 1");
        ArrayList<OrderItem> orderItems = new ArrayList<>();
        OrderItem orderItem1 = new OrderItem(3, productsForSale.get(0));
        OrderItem orderItem2 = new OrderItem(2, productsForSale.get(1));
        addItemToOrder(orderItems, orderItem1);
        addItemToOrder(orderItems, orderItem2);

        printOrderedItems(orderItems);
    }

    public static void listProducts() {
        for (var item: productsForSale) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> orderItems, OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public static void printOrderedItems(ArrayList<OrderItem> orderItems) {
        double salesTotal = 0;
        for (OrderItem oI : orderItems) {
            oI.getProductForSale().printPricedItem(oI.getQuantity());
            salesTotal += oI.getProductForSale().getSalesPrice(oI.getQuantity());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
