package br.com.learn.strategy.service;

import br.com.learn.strategy.dto.PaymentDTO;

public interface PaymentService {

    void processPayment(PaymentDTO paymentDTO);
    
}
