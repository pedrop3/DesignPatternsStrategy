package br.com.learn.strategy.factory.currency.handler;

import org.springframework.stereotype.Component;

import br.com.learn.strategy.factory.currency.CurrencyMethodHandler;


@Component
public class CurrencyUSD implements CurrencyMethodHandler {
    
    @Override
    public double convertTo(double amount) {
        return amount * 0.21; 
    }
}