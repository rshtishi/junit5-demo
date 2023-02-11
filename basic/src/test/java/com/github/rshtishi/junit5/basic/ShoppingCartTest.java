package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShoppingCartTest {

    ShoppingCart shoppingCart;

    @BeforeAll
    void setup() {
        shoppingCart = new ShoppingCart();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/shopping_cart_test_cases.csv", numLinesToSkip = 1)
    public void testAddItem(String item, int quantity, int expectedQuantity) {
        shoppingCart.addItem(item, quantity);
        int actualQuantity = shoppingCart.getQuantity(item);
        assertEquals(expectedQuantity, actualQuantity);
    }

}