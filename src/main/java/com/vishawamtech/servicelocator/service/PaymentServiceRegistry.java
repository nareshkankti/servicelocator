package com.vishawamtech.servicelocator.service;

import com.vishawamtech.servicelocator.command.PaymentRequest;
import org.springframework.stereotype.Service;

//@Service("com.vishawamtech.servicelocator.service")
public interface PaymentServiceRegistry {
    public PaymentService getService(String serviceName);

}
