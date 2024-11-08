package com.wendey.payment_service.resource.impl;


import com.wendey.payment_service.model.Payment;
import com.wendey.payment_service.resource.PaymentResource;
import com.wendey.payment_service.services.PaymentService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "payments")
public class PaymentResourceImpl implements PaymentResource {

    private final PaymentService paymentService;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        paymentService.sendPayment(payment);
       return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    
}
