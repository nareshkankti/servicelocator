package com.vishawamtech.servicelocator.service;

import com.vishawamtech.servicelocator.command.PaymentRequest;

public interface PaymentService {
    public String pay(PaymentRequest paymentRequest);
}
