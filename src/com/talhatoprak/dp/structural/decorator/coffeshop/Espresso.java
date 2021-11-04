package com.talhatoprak.dp.structural.decorator.coffeshop;

import java.math.BigDecimal;

public class Espresso extends Coffee {
    @Override
    String getName() {
        return "Espresso";
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(15);
    }
}
