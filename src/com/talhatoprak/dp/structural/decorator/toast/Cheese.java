package com.talhatoprak.dp.structural.decorator.toast;

import java.math.BigDecimal;

public class Cheese extends Topping {
    public Cheese(Toastable toasTopping, String name, BigDecimal price) {
        super(toasTopping, name, price);
    }
}
