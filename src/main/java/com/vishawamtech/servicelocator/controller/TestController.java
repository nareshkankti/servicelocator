package com.vishawamtech.servicelocator.controller;

import com.vishawamtech.servicelocator.command.PaymentRequest;
import com.vishawamtech.servicelocator.service.PaymentServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


   /* public void setPaymentServiceRegistry(PaymentServiceRegistry paymentServiceRegistry) {
        this.paymentServiceRegistry = paymentServiceRegistry;
    }*/
    @Autowired
    private PaymentServiceRegistry paymentServiceRegistry;


    /*public TestController(PaymentServiceRegistry paymentServiceRegistry) {
        this.paymentServiceRegistry = paymentServiceRegistry;
    }*/

    /**
     * http://localhost:8080/pay
     * {
     *     "amount":"133.20",
     *     "paymentMethod": "phonePePay"     *
     * }
     * @param paymentRequest
     * @return response
     */
    @PostMapping("/pay")
    public String executePaymentMethod(@RequestBody PaymentRequest paymentRequest) {
        String response = paymentServiceRegistry.getService(paymentRequest.paymentMethod()).pay(paymentRequest);
        System.out.println(response);
        return response;
    }
}
