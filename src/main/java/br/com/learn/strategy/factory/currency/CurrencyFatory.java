package br.com.learn.strategy.factory.currency;

import br.com.learn.strategy.enums.TargetCurrencyEnum;
import br.com.learn.strategy.factory.currency.handler.CurrencyEUR;
import br.com.learn.strategy.factory.currency.handler.CurrencyGBP;
import br.com.learn.strategy.factory.currency.handler.CurrencyUSD;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CurrencyFatory {

    public static CurrencyMethodHandler createCurrencyProcessor(TargetCurrencyEnum targetCurrencyEnum) {

        return switch (targetCurrencyEnum) {
            case EUR -> new CurrencyEUR();
            case GBP -> new CurrencyGBP();
            case USD -> new CurrencyUSD();
            default -> throw new IllegalArgumentException("Invalid currency" );
        };
    }
    
}
