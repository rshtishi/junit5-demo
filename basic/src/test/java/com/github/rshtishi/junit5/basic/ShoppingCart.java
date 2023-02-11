package com.github.rshtishi.junit5.basic;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Integer> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void addItem(String item, int quantity) {
        if (items.containsKey(item)) {
            int currentQuantity = items.get(item);
            items.put(item, currentQuantity + quantity);
        } else {
            items.put(item, quantity);
        }
    }

    public int getQuantity(String item) {
        return items.getOrDefault(item, 0);
    }
}