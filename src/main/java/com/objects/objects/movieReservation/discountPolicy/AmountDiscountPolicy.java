package com.objects.objects.movieReservation.discountPolicy;

import com.objects.objects.movieReservation.Money;
import com.objects.objects.movieReservation.Screening;
import com.objects.objects.movieReservation.discountCondition.DiscountCondition;

/**
 * 금액 할인 정책
 */
public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
