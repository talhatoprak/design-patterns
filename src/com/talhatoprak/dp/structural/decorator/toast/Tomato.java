package com.talhatoprak.dp.structural.decorator.toast;

import java.math.BigDecimal;

public class Tomato extends Topping{
    public Tomato(Toastable toasTopping, String name, BigDecimal price) {
        super(toasTopping, name, price);
    }
}
