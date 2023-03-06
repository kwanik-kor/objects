package com.objects.objects.chapter02.part01;

public interface DiscountCondition {

    /**
     * 상영정보가 할인이 가능한 경우 true 반환
     * @param screening 상영정보
     * @return 할인 가능 여부
     */
    boolean isSatisfiedBy(Screening screening);

}
