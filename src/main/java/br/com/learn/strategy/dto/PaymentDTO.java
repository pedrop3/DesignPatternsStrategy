package br.com.learn.strategy.dto;

import br.com.learn.strategy.enums.PaymentMethodEnum;
import br.com.learn.strategy.enums.TargetCurrencyEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentDTO {

    private double amount;
    private PaymentMethodEnum paymentMethodEnum;
    private TargetCurrencyEnum targetCurrencyEnum;
    private String accountNumber; // For Bank Transfer
    private String bankCode; // For Bank Transfer
    private String cardNumber; // For Credit Card
    private String expirationDate; // For Credit Card
    private String securityCode; // For Credit Card
    private String email; // For PayPal
    private String password; // For PayPal

}
    
