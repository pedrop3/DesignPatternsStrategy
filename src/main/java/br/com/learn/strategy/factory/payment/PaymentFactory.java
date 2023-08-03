package br.com.learn.strategy.factory.payment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.learn.strategy.dto.PaymentDTO;
import br.com.learn.strategy.enums.PaymentMethodEnum;
import br.com.learn.strategy.factory.payment.handler.BankTransferPayment;
import br.com.learn.strategy.factory.payment.handler.CreditCardPayment;
import br.com.learn.strategy.factory.payment.handler.PayPalPayment;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;



@Component
@RequiredArgsConstructor
public class PaymentFactory {

    private final Map<PaymentMethodEnum, PaymentMethodHandler> paymentProcessorMap;

    public PaymentFactory() {
        paymentProcessorMap = new HashMap<>();
    }


    @Autowired
    public PaymentFactory(List<PaymentMethodHandler> paymentProcessors) {

        paymentProcessorMap = new HashMap<>();

        for (PaymentMethodHandler paymentProcessor : paymentProcessors) {
            paymentProcessorMap.put(paymentProcessor.getType(), paymentProcessor);
        }
    }

    public PaymentMethodHandler getPaymentProcessor(PaymentMethodEnum paymentMethodEnum) {
        return paymentProcessorMap.get(paymentMethodEnum);
    }

}