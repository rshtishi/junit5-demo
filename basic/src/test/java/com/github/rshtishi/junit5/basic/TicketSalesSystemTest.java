package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.RepeatedTest;


import static org.junit.jupiter.api.Assertions.*;


public class TicketSalesSystemTest {

    @RepeatedTest(10)
    public void testSellTicket() {
        TicketSalesSystem ticketSalesSystem = new TicketSalesSystem(100);
        for (int i = 0; i < 110; i++) {
            ticketSalesSystem.sellTicket();
        }
        ticketSalesSystem.shutDown();
        assertEquals(100, ticketSalesSystem.getSoldTickets().get());
    }
}