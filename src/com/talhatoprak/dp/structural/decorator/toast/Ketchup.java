package com.talhatoprak.dp.structural.decorator.toast;

import java.math.BigDecimal;

public class Ketchup extends Topping{
    public Ketchup(Toastable toasTopping, String name, BigDecimal price) {
        super(toasTopping, name, price);
    }
}
