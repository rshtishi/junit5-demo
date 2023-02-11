package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @ParameterizedTest
    @EnumSource(Order.PaymentMethod.class)
    public void testProcessPayment(Order.PaymentMethod paymentMethod) {
        OrderService orderService = new OrderService();
        Order order = new Order(123, paymentMethod);
        assertNotNull(orderService.processPayment(order));
    }

}