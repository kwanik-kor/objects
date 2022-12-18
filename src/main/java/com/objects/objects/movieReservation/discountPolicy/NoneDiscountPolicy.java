package com.objects.objects.movieReservation.discountPolicy;

import com.objects.objects.movieReservation.Money;
import com.objects.objects.movieReservation.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
