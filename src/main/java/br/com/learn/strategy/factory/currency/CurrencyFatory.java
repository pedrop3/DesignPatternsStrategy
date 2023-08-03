package br.com.learn.strategy.factory.currency;

import org.springframework.stereotype.Component;

import br.com.learn.strategy.enums.TargetCurrencyEnum;
import br.com.learn.strategy.factory.currency.handler.CurrencyEUR;
import br.com.learn.strategy.factory.currency.handler.CurrencyGBP;
import br.com.learn.strategy.factory.currency.handler.CurrencyUSD;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CurrencyFatory {

    public static CurrencyMethodHandler createCurrencyProcessor(TargetCurrencyEnum targetCurrencyEnum) {

        switch (targetCurrencyEnum) {
            case EUR:
                return new CurrencyEUR();
            case GBP:
                return new CurrencyGBP();
            case USD:
                return new CurrencyUSD();
            default:
                throw new IllegalArgumentException("Invalid currency : " );
        }
    }
    
}
