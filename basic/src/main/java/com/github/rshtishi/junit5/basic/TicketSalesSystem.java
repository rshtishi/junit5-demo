package com.github.rshtishi.junit5.basic;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TicketSalesSystem {

    private final int totalTickets;
    private final AtomicInteger soldTickets = new AtomicInteger();
    private final ExecutorService executor = Executors.newFixedThreadPool(10);

    public TicketSalesSystem(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public void sellTicket() {
        executor.submit(() -> {
            if (soldTickets.get() < totalTickets) {
                int newValue = soldTickets.incrementAndGet();
                System.out.println("Sold ticket: " + newValue);
            } else {
                System.out.println("Tickets are sold out");
            }
        });
    }

    public AtomicInteger getSoldTickets() {
        return soldTickets;
    }

    public void shutDown() {
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}