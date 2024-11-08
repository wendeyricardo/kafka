package com.wendey.payment_service.services.impl;

import org.springframework.stereotype.Service;

import com.wendey.payment_service.model.Payment;
import com.wendey.payment_service.services.PaymentService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVISE_IMPL ::: Recebi o pagamento {}", payment);
        
    }
    
}
