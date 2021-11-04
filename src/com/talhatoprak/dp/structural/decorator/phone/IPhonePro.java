package com.talhatoprak.dp.structural.decorator.phone;

import java.math.BigDecimal;

public class IPhonePro extends PhoneDecorator{
    public IPhonePro(Phone phone) {
        super(phone);
    }

    @Override
    public String getName() {
        return super.getName()+ " Pro";
    }

    @Override
    public int getCameraCount() {
        return super.getCameraCount()+1;
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice()
                .add(BigDecimal.valueOf(100));
    }
}
