package com.github.rshtishi.junit5.basic;

public class Order {

    public static enum PaymentMethod {
        CREDIT_CARD,DEBIT_CARD;
    }

    private int orderId;
    private PaymentMethod paymentMethod;

    public Order(int orderId, PaymentMethod paymentMethod) {
        this.orderId = orderId;
        this.paymentMethod = paymentMethod;
    }

    public int getOrderId() {
        return orderId;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

}
