package com.objects.objects.chapter01.part03;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this.amount = amount;
    }

    public Bag(Invitation invitation, Ticket ticket) {
        this.invitation = invitation;
        this.ticket = ticket;
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

    public boolean hasInvitation() {
        return invitation != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

}
