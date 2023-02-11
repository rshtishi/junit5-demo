package com.github.rshtishi.junit5.basic;

public class OrderService {

    public String processPayment(Order order) {
        switch (order.getPaymentMethod()) {
            case CREDIT_CARD:
                return "Payment processed successfully via credit card for order id: " + order.getOrderId();
            case DEBIT_CARD:
                return "Payment processed successfully via debit card for order id: " + order.getOrderId();
            default:
                return "";
        }
    }
}
