package com.backendTest.model;

public class DiscountCard {
    int cardNumber;
    int discountRate;

    public DiscountCard(int cardNumber, int discountRate) {
        this.cardNumber = cardNumber;
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return "DiscountCard [cardNumber=" + cardNumber + ", discountRate=" + discountRate + "]";
    }
}
