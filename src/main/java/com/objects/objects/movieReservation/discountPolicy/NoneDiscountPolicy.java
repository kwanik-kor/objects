package com.objects.objects.movieReservation.discountPolicy;

import com.objects.objects.movieReservation.Money;
import com.objects.objects.movieReservation.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
