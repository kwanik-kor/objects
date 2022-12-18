package com.objects.objects.movieReservation.discountCondition;

import com.objects.objects.movieReservation.Screening;

/**
 * 할인 조건
 * - 순번 조건, 기간 조건
 */
public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
