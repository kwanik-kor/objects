package com.objects.objects.chapter02.part01;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audiencCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audiencCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audiencCount = audiencCount;
    }
}
