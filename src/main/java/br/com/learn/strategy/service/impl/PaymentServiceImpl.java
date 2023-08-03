package br.com.learn.strategy.service.impl;

import org.springframework.stereotype.Service;

import br.com.learn.strategy.dto.PaymentDTO;
import br.com.learn.strategy.factory.currency.CurrencyFatory;
import br.com.learn.strategy.factory.currency.CurrencyMethodHandler;
import br.com.learn.strategy.factory.currency.handler.CurrencyEUR;
import br.com.learn.strategy.factory.payment.PaymentFactory;
import br.com.learn.strategy.factory.payment.PaymentMethodHandler;
import br.com.learn.strategy.service.PaymentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;



@Service
@AllArgsConstructor
@Slf4j
public class PaymentServiceImpl  implements PaymentService {

    private final PaymentFactory paymentFactory;
    
    @Override
    public void processPayment(PaymentDTO paymentDTO) {

        PaymentMethodHandler paymentMethodHandler = this.paymentFactory.getPaymentProcessor(paymentDTO.getPaymentMethodEnum());
        
        CurrencyMethodHandler currencyMethodHandler = CurrencyFatory.createCurrencyProcessor(paymentDTO.getTargetCurrencyEnum());
        var value = currencyMethodHandler.convertTo(paymentDTO.getAmount());

        boolean sucess =  paymentMethodHandler.processPayment(paymentDTO);

        log.info("processPayment {} | {} {}",sucess,  paymentDTO.getTargetCurrencyEnum(),value);
    }




}