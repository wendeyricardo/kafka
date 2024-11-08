package com.wendey.payment_service.services;

import com.wendey.payment_service.model.Payment;

public interface PaymentService {
    
    void sendPayment(Payment payment);
}
