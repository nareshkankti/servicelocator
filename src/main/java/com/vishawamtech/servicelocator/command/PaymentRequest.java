package com.vishawamtech.servicelocator.command;

import java.math.BigDecimal;
public record PaymentRequest(BigDecimal amount, String paymentMethod) {
    @Override
    public String toString() {
        return "PaymentRequest{" +
                "amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
