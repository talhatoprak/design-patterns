package com.talhatoprak.dp.structural.decorator.coffeshop;

import java.math.BigDecimal;
import java.util.List;

public abstract class ExtraCoffe extends Coffee {
    Coffee base;
    List<Priceable> extras;

    @Override
    public BigDecimal getPrice() {
        return extras.stream()
                .map(Priceable::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .add(base.getPrice());
    }
}
