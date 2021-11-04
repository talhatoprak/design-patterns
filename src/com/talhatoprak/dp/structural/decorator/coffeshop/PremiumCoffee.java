package com.talhatoprak.dp.structural.decorator.coffeshop;

import java.math.BigDecimal;
import java.util.List;

public abstract class PremiumCoffee extends ExtraCoffe{
    List<Priceable> sides;

    @Override
    public BigDecimal getPrice() {
        return sides.stream()
                .map(Priceable::getPrice)
                .reduce(BigDecimal.ZERO,BigDecimal::add)
                .add(super.getPrice());
    }
}
