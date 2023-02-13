package com.github.rshtishi.junit5.basic;

public class ShippingCostCalculator {

    public double calculateShippingCost(String product, int quantity, boolean expressDelivery) {
        double cost = 0;
        if (product.equals("book")) {
            cost = 10 * quantity;
        } else if (product.equals("electronics")) {
            cost = 20 * quantity;
        }
        if (expressDelivery) {
            cost *= 1.5;
        }
        return cost;
    }
}
