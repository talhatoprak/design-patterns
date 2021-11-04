package com.talhatoprak.dp.structural.decorator.coffeshop;

import java.math.BigDecimal;
import java.util.Arrays;

public class ColombianCoffee extends PremiumCoffee {
    public ColombianCoffee() {
        this.base = new Latte();
        this.extras = Arrays.asList(() -> BigDecimal.valueOf(1.5), () -> BigDecimal.valueOf(4));
        this.sides = Arrays.asList(
                () -> BigDecimal.valueOf(2.25),
                () -> BigDecimal.valueOf(0.25),
                () -> BigDecimal.valueOf(1.50)
        );
    }

    @Override
    String getName() {
        return "Colombian Coffee";
    }
}
