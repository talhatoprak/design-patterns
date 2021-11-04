package com.talhatoprak.dp.structural.decorator.coffeshop;

import java.math.BigDecimal;
import java.util.Arrays;

public class Latte extends ExtraCoffe{
    public Latte(){
        this.base=new Espresso();
        this.extras= Arrays.asList(()-> BigDecimal.valueOf(1.5),()->BigDecimal.valueOf(4));
    }
    @Override
    String getName() {
        return "Latte";
    }
}
