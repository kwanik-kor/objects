package com.objects.objects.ticketSeller;

/**
 * 관람객 - 소지품을 보관하기 위해 가방을 소유하고 있다.
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    /**
     * @return 지불할 금액
     */
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
