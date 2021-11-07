package com.talhatoprak.dp.structural.decorator.toast;

import java.math.BigDecimal;

public class Salad extends Topping{
    public Salad(Toastable toasTopping, String name, BigDecimal price) {
        super(toasTopping, name, price);
    }
}
