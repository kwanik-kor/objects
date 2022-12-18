package com.objects.objects.movieReservation.discountPolicy;

import com.objects.objects.movieReservation.Money;
import com.objects.objects.movieReservation.Screening;
import com.objects.objects.movieReservation.discountCondition.DiscountCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 금액 할인 정책과 비율 할인 정책
 * - 계산 방식에만 차이가 있으므로 추상 클래스로 생성
 * - Template Method Pattern
 */
public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
