package com.objects.objects.ticketSeller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 매표소 - 초대장을 티켓으로 교환하거나 구매할 수 있어야 함
 */
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
