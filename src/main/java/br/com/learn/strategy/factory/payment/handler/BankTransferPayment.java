package br.com.learn.strategy.factory.payment.handler;

import org.springframework.stereotype.Component;

import br.com.learn.strategy.dto.PaymentDTO;
import br.com.learn.strategy.enums.PaymentMethodEnum;
import br.com.learn.strategy.factory.payment.PaymentMethodHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class BankTransferPayment implements PaymentMethodHandler {

    @Override
    public boolean processPayment(PaymentDTO paymentDTO) {
        log.info("Process BankTransferPayment");
        return true;
    }


    @Override
    public PaymentMethodEnum getType() {
        return PaymentMethodEnum.BANK_TRANSFER;
    }
}
