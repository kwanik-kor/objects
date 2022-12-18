package com.objects.objects.ticketSeller;

/**
 * 판매원 - 매표소에서 초대장을 티켓으로 교환하거나 티켓을 판매하는 역할을 수행
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }

}
