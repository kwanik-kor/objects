package com.objects.objects.movieReservation.discountPolicy;

import com.objects.objects.movieReservation.Money;
import com.objects.objects.movieReservation.Screening;

/**
 * 추상화 수준에서의 개념적 결합 방지를 위한 인터페이스 분리
 */
public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
