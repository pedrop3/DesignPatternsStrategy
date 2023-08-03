package br.com.learn.strategy.factory.payment.handler;

import org.springframework.stereotype.Component;

import br.com.learn.strategy.dto.PaymentDTO;
import br.com.learn.strategy.enums.PaymentMethodEnum;
import br.com.learn.strategy.factory.payment.PaymentMethodHandler;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@AllArgsConstructor
@Component
@Slf4j
public class PayPalPayment implements PaymentMethodHandler {

    @Override
    public boolean processPayment(PaymentDTO paymentDTO) {
        log.info("Process PayPalPayment");

        return true;
    }
    
    @Override
    public PaymentMethodEnum getType() {
        return PaymentMethodEnum.PAYPAL;
    }
}
