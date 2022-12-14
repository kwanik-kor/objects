package com.objects.objects.ticketSeller;

/**
 *  관람객이 가지고 올 소지품(초대장, 현금, 티켓)을 보관할 가방
 */
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    /**
     * 초대장 없이 현금만 보관하는 경우
     */
    public Bag(Long amount) {
        this.amount = amount;
    }

    /**
     * 초대장과 현금을 보관하는 경우
     */
    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    /**
     * @return 초대장 보유 여부
     */
    private boolean hasInvitation() {
        return this.invitation != null;
    }

    /**
     * @return 티켓 소유여부
     */
    private boolean hasTicket() {
        return this.ticket != null;
    }

    /**
     * 초대장을 티켓으로 교환
     */
    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

}
