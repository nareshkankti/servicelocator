package com.vishawamtech.servicelocator.service.serviceimpl;

import com.vishawamtech.servicelocator.command.PaymentRequest;
import com.vishawamtech.servicelocator.service.PaymentService;
import org.springframework.stereotype.Service;

@Service("amazonPay")
public class AmazonPaymentServiceImpl implements PaymentService {
    @Override
    public String pay(PaymentRequest paymentRequest) {
        System.out.println("Payment Method:: " + paymentRequest.paymentMethod() + "Payment Amount::  " + paymentRequest.amount() );
        return " response from AmazonPaymentService";
    }
}
