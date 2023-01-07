package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@DisplayName("Money Test Cases")
class MoneyTest {

    @DisplayName("constructor should set amount and ccy for valid amont and ccy input")
    @Test
    void constructorShouldSetAmountAndCCY() {
        //setup
        double amount = 10;
        String ccy = "EUR";
        //execute
        Money money = new Money(amount, ccy);
        //verify
        assertEquals(amount, money.getAmount());
        assertEquals(ccy, money.getCcy());
    }

    @DisplayName("When Amount is Invalid Then Constructor will throw exception with Invalid Amount Exception")
    @Test
    void constructorShouldExceptionWithAmountInvalidMessageWheAmountIsInvalid() {
        //setup
        double amount = -1;
        String ccy = "EUR";
        // execute
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Money(amount, ccy));
        //verify
        String expectedMessage = "Amount cannot be negative";
        assertEquals(expectedMessage, exception.getMessage());
    }

}