package br.com.learn.strategy.factory.payment.handler;

import org.springframework.stereotype.Component;

import br.com.learn.strategy.dto.PaymentDTO;
import br.com.learn.strategy.enums.PaymentMethodEnum;
import br.com.learn.strategy.factory.payment.PaymentMethodHandler;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CreditCardPayment implements PaymentMethodHandler {

    @Override
    public boolean processPayment(PaymentDTO paymentDTO) {
        log.info("Process CreditCardPayment");
        return true;
    }

    @Override
    public PaymentMethodEnum getType() {
        return PaymentMethodEnum.CREDIT_CARD;
    }
    
}
