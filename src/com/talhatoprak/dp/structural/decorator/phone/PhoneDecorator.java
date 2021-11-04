package com.talhatoprak.dp.structural.decorator.phone;

import java.math.BigDecimal;

public class PhoneDecorator implements Phone {
    private Phone base;
    public PhoneDecorator(Phone phone){
        base=phone;
    }
    @Override
    public String getName() {
        System.out.println("Base Name is: "+ base.getName());
        return base.getName();
    }

    @Override
    public int getCameraCount() {
        return base.getCameraCount();
    }

    @Override
    public BigDecimal getPrice() {
        return base.getPrice();
    }
}
