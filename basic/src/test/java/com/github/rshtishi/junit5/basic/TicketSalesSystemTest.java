package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;


import static org.junit.jupiter.api.Assertions.*;


public class TicketSalesSystemTest {

    @BeforeEach
    void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();
        String methodName = testInfo.getTestMethod().get().getName();
        System.out.println(String.format("About to execute repetition %d of %d for %s",
                currentRepetition, totalRepetitions, methodName));
    }

    @RepeatedTest(value = 10, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    public void testSellTicket() {
        TicketSalesSystem ticketSalesSystem = new TicketSalesSystem(100);
        for (int i = 0; i < 110; i++) {
            ticketSalesSystem.sellTicket();
        }
        ticketSalesSystem.shutDown();
        assertEquals(100, ticketSalesSystem.getSoldTickets().get());
    }
}