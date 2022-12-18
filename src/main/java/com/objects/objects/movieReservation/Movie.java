package com.objects.objects.movieReservation;

import com.objects.objects.movieReservation.discountPolicy.DiscountPolicy;

import java.time.Duration;

/**
 * 영화
 * - 어떤 할인 정책을 사용할 것인지 결정하는 코드가 존재하지 않는다!
 */
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
