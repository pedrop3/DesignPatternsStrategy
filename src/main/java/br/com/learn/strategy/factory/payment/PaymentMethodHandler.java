package br.com.learn.strategy.factory.payment;

import br.com.learn.strategy.dto.PaymentDTO;
import br.com.learn.strategy.enums.PaymentMethodEnum;

public interface PaymentMethodHandler {

    boolean processPayment(PaymentDTO  paymentDTO);

    PaymentMethodEnum getType(); 
    
}
